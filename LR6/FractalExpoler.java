import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.geom.Rectangle2D;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class FractalExplorer {
    /* Размер экрана (квадратное отображение) **/
    private int displaySize;

    /* Для отображения в процессе вычисления фрактала **/
    private JImageDisplay display;

    /* Для отображения других видов фракталов в будущем **/
    private FractalGenerator generator;

    /* Указывает диапазон комплексной области, которая выводится на экран **/
    private Rectangle2D.Double range;

    /* Принимает размер экрана, инициализирует объекты диапазона и генератора
     * фрактала
     */
    public FractalExplorer(int length) {
        this.displaySize = length;
        range = new Rectangle2D.Double();
        generator = new Mandelbrot();
        generator.getInitialRange(range);
    }

    /** Инициализация и отображение окна */
    public void createAndShowGUI() {
        display = new JImageDisplay(displaySize, displaySize);
        JFrame frame = new JFrame();
        /** Инициализация кнопок */
        JPanel buttonsPanel = new JPanel();
        JButton saveButton = new JButton("Save Image");
        JButton resetButton = new JButton("Reset Display");
        buttonsPanel.add(saveButton, BorderLayout.EAST);
        buttonsPanel.add(resetButton, BorderLayout.WEST);
        /** Комбо-бокс */
        JPanel comboPanel = new JPanel();
        JLabel comboLabel = new JLabel("Fractal:");
        JComboBox<FractalGenerator> comboBox = new JComboBox<FractalGenerator>();
        comboBox.addItem(new Mandelbrot());
        comboBox.addItem(new Tricorn());
        comboBox.addItem(new BurningShip());
        comboPanel.add(comboLabel, BorderLayout.EAST);
        comboPanel.add(comboBox, BorderLayout.WEST);
        /** ActionListener - Обработка действий компонентов окна */
        ActionListener actionListner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (evt.getSource().equals(resetButton)) {
                    generator.getInitialRange(range);
                    drawFractal();
                }
                else if (evt.getSource().equals(saveButton)) {
                    JFileChooser fileChooser = new JFileChooser();
                    FileFilter filter = new FileNameExtensionFilter("PNG Images", "png");
                    fileChooser.setFileFilter(filter);
                    fileChooser.setAcceptAllFileFilterUsed(false);
                    if (fileChooser.showDialog(frame, "Save file") == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = fileChooser.getSelectedFile();
                        try {
                            ImageIO.write(display.image, "png", selectedFile);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Cannot save image", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                else if (evt.getSource().equals(comboBox)) {
                    generator = (FractalGenerator)comboBox.getSelectedItem();
                    generator.getInitialRange(range);
                    drawFractal();
                }
            }
        };
        /** MouseListener - обрарботка действий мыши */
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double xCoord = FractalGenerator.getCoord(range.x, range.x + range.width, displaySize, e.getX());
                double yCoord = FractalGenerator.getCoord(range.y, range.y + range.height, displaySize, e.getY());
                generator.recenterAndZoomRange(range, xCoord, yCoord, 0.5);
                drawFractal();
            }
            public void mouseEntered(MouseEvent e) {};
            public void mouseExited(MouseEvent e) {};
            public void mouseReleased(MouseEvent e) {};
            public void mousePressed(MouseEvent e) {};
        };
        resetButton.addActionListener(actionListner);
        saveButton.addActionListener(actionListner);
        comboBox.addActionListener(actionListner);
        display.addMouseListener(mouseListener);
        /** Параметры окна */
        frame.add(display, BorderLayout.CENTER);
        frame.add(buttonsPanel, BorderLayout.SOUTH);
        frame.add(comboPanel, BorderLayout.NORTH);
        frame.setTitle("Fractal Explorer #5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    /** Отрисовка фрактала попиксельно **/
    private void drawFractal() {
        
        for (int x = 0; x < displaySize; x++) {
            double xCoord = FractalGenerator.getCoord(range.x, range.x + range.width, displaySize, x);
            for (int y = 0; y < displaySize; y++) {
                double yCoord = FractalGenerator.getCoord(range.y, range.y + range.height, displaySize, y);
                int n = generator.numIterations(xCoord, yCoord);
                if (n == -1) {
                    display.drawPixel(x, y, 0);
                }
                else {
                    float hue = 0.7f + (float)n / 200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                    display.drawPixel(x, y, rgbColor);
                }
            }
        }
        /** После того, как вы закончили отрисовывать все пиксели, вам необходимо 
         * обновить JimageDisplay в соответствии с текущим изображением.
         */
        display.repaint();
    }

    public static void main(String[] args) {
        FractalExplorer explorer = new FractalExplorer(800);
        explorer.createAndShowGUI();
        explorer.drawFractal();
    }
}