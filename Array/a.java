import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements  of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The input array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("enter the K rotation:");
        int k=sc.nextInt();
        int[] ans=new int[n];
        for(int m=0;m<n;m++){
           int new_index=(m+k)%n;
           ans[new_index]=arr[m];

        } System.out.println("The output array:");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");

        }


    }
}