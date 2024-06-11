package Calculator;

public class operation {
    public static void addition(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Result: " + result);
    }

    public static void subtraction(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Result: " + result);
    }

    public static void multiplication(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Result: " + result);
    }

    public static void division(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = (double) n1 / n2;
            System.out.println("Result: " + result);
        }
    }
}
