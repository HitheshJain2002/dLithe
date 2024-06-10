package fibbonici;

public class fib{
    public static int fib(int n) {


    if(n==0||n==1){
        return 1;
    }
    int fib1=fib(n-1);
    int fib2=fib(n-2);
    int res=fib2+fib1;
    return res;

    }

    public static void main(String[] args) {
       int ans= fib(8);
        System.out.println(ans);
    }
}
