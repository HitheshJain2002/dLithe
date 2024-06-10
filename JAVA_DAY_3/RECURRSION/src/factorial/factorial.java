package factorial;

public class factorial {
    public static int factorial(int n) {

        if (n == 0) {
            return 1;


        }
        int fact=factorial(n-1);
       int  fact_answer=n*fact;

        return fact_answer;
    }

    public static void main(String[] args) {
        int result =factorial(5);
        System.out.println(result);
    }
}


