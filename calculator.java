// core calculator functions

public class calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public double squareRoot(double a) throws ArithmeticException {
        if (a < 0) throw new ArithmeticException("Cannot calculate square root of a negative number.");
        return Math.sqrt(a);
    }
}