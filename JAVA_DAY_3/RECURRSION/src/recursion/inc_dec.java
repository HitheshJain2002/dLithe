package recursion;

public class inc_dec {
    public static void dec(int n){
        if(n==1){
            System.out.println(n+" ");
            return ;
        }
        dec(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        dec(6);
    }
}
