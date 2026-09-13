import java.util.Scanner;

class Calculator {
    
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Calculator myCalc = new Calculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1 for Addition (+)");
        System.out.println("2 for Subtraction (-)");
        System.out.println("3 for Multiplication (*)");
        System.out.println("4 for Division (/)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = myCalc.add(num1, num2);
                break;
            case 2:
                result = myCalc.subtract(num1, num2);
                break;
            case 3:
                result = myCalc.multiply(num1, num2);
                break;
            case 4:
                result = myCalc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please restart the program.");
                validChoice = false;
        }

        if (validChoice) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}