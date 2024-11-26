public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        calculator calculator = new calculator();
        boolean running = true;

        while (running) {
            int operation = inputHandler.getOperation();

            switch (operation) {
                case 1: // Addition
                    double num1 = inputHandler.getNumber("Enter the first number: ");
                    double num2 = inputHandler.getNumber("Enter the second number: ");
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;

                case 2: // Subtraction
                    num1 = inputHandler.getNumber("Enter the first number: ");
                    num2 = inputHandler.getNumber("Enter the second number: ");
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;

                case 3: // Multiplication
                    num1 = inputHandler.getNumber("Enter the first number: ");
                    num2 = inputHandler.getNumber("Enter the second number: ");
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;

                case 4: // Division
                    num1 = inputHandler.getNumber("Enter the numerator: ");
                    num2 = inputHandler.getNumber("Enter the denominator: ");
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5: // Power
                    num1 = inputHandler.getNumber("Enter the base: ");
                    num2 = inputHandler.getNumber("Enter the exponent: ");
                    System.out.println("Result: " + calculator.power(num1, num2));
                    break;

                case 6: // Square Root
                    num1 = inputHandler.getNumber("Enter the number: ");
                    try {
                        System.out.println("Result: " + calculator.squareRoot(num1));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7: // Exit
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}
    

