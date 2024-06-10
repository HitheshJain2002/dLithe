package powe_function;

public class power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int soln=power(x,n-1);
        int result=x*soln;
        return result;

    }
    public static int lognpower(int x,int n){
        if(n==0){
            return 1;
        }
        int half_soln=lognpower(x,n/2);
        int  full_sol=half_soln*half_soln;
        if(n%2!=0){
            full_sol=x*full_sol;
        }
        return full_sol;
    }



    public static void main(String[] args) {
       int sol= power(2,5);
       int sol2=lognpower(2,5);
        System.out.println(sol);
        System.out.println(sol2);


    }
}
