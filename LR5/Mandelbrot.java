import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    /** Для отображения правильного начального диапазона для фрактала */
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    /** Константа максимального количества итераций */
    public static final int MAX_ITERATIONS = 2000;

    /** Реализует итеративную функцию для фрактала Мандельброта */
    @Override
    public int numIterations(double x, double y) {
        ComplexNumber c = new ComplexNumber(x, y);
        ComplexNumber z = new ComplexNumber(0, 0);
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            if (z.abs_squared() > 2*2)
                return i;
            /** След. элемент последовательности z = z^2+c */
            z = z.multiply(z).plus(c);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Mandelbrot";
    }
}