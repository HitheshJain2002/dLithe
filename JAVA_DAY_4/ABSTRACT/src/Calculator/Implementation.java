package Calculator;

import java.util.Scanner;

public class Implementation implements calculatorAPP {

    public static void main(String[] args) {
        Implementation calc = new Implementation();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation: 1) Addition 2) Subtraction 3) Multiplication 4) Division 5) Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            }

            System.out.println("Enter the First Number:");
            int n1 = scanner.nextInt();
            System.out.println("Enter the Second Number:");
            int n2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    calc.addition(n1, n2);
                    break;
                case 2:
                    calc.subtraction(n1, n2);
                    break;
                case 3:
                    calc.multiplication(n1, n2);
                    break;
                case 4:
                    calc.division(n1, n2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    @Override
    public void addition(int n1, int n2) {
        operation.addition(n1, n2);
    }

    @Override
    public void subtraction(int n1, int n2) {
        operation.subtraction(n1, n2);
    }

    @Override
    public void multiplication(int n1, int n2) {
        operation.multiplication(n1, n2);
    }

    @Override
    public void division(int n1, int n2) {
        operation.division(n1, n2);
    }
}