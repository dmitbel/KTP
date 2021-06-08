public class ComplexNumber {
    /** Реальная часть */
    private double x;
    /** Воображаемая часть */
    private double y;

    ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Реальная часть числа */
    public ComplexNumber re() {
        return new ComplexNumber(this.x, 0);
    }

    /** Воображаемая часть */
    public ComplexNumber im() {
        return new ComplexNumber(0, this.y);
    }

    /** Модуль */
    public ComplexNumber abs() {
        return new ComplexNumber(this.x*this.x + this.y*this.y, 0);
    }

    /** Сложение с комплексным числом */
    public ComplexNumber plus(ComplexNumber other) {
        return new ComplexNumber(this.x+other.x, this.y+other.y);
    }

    /** Умножение с комплексным числом */
    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(this.x*other.x - this.y*other.y, this.x*other.y + this.y*other.x);
    }

    /** Для вычисления сопряжённого комплексного числа */
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.x, -this.y);
    }

    /** Вспомогательный метод для вычисления квадрата модуля комплексного числа */
    public ComplexNumber abs_of_each() {
        return new ComplexNumber(Math.abs(this.x), Math.abs(this.y));
    }

    /** Вспомогательный метод для вычисления квадрата модуля комплексного числа */
    public double abs_squared() {
        return this.x*this.x + this.y*this.y;
    }
}