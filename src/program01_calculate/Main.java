package program01_calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        char choice;
        do {
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println("Please enter one of the symbol +, -, *, / :");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(num1, num2, symbol);

            System.out.print(" Would you like do more calculations? (Enter 'Y' or 'N'): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program terminated.");
        scanner.close();
    }
}
