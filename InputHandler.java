import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    // Get a valid number from the user
    public double getNumber(String prompt) {
        double number;
        while (true) {
            try {
                System.out.print(prompt);
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        return number;
    }

    // Get a valid operator from the user
    public int getOperation() {
        int operation;
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Power\n6. Square Root\n7. Exit");
            System.out.print("Enter your choice: ");
            try {
                operation = Integer.parseInt(scanner.nextLine());
                if (operation >= 1 && operation <= 7) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please select a valid operation.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
        }
        return operation;
    }
}