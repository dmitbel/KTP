import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator {
    /** Для отображения правильного начального диапазона для фрактала */
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2;
        range.width = 4;
        range.height = 4;
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
            /** След. элемент последовательности z = z^2+c 
             * Единственное отличие только в том, что используется комплексное сопряжение z на каждой итерации.
            */
            z = z.conjugate();
            z = z.multiply(z).plus(c);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Tricorn";
    }
}