import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return 'Not a Number' if division by zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                exit = true;
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}