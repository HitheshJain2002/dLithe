import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int low=arr[0];
        int high=arr[n-1];
        System.out.println("enter the elements  of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The input array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println();
        System.out.println("enter the Key");
        int key=sc.nextInt();
        while (low<=high){
            int mid=((low+high)/2);
            if(key>mid){
                low=mid+1;


            }else{
                high=mid-1;
            }
            System.out.println("Key not found");

        }
    }

}