import java.util.Scanner;

public class StopStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number of TimeStop Watch Pressed:");
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Stop Watch Still Running.......");
            return;
        }
        System.out.println("enter the array duration");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Duration of The array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

            int result = 0;


           for(int i=1;i<n;i+=2){
               result+=arr[i]-arr[i-1];
           }
            System.out.println("total duration:"+result);




        }
    }

