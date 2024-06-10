package oops;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
int min=Integer.MAX_VALUE;

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

        for (int i = 0; i < n-1; i++) {

              int smallest=i;
              for(int j=i+1;j<n;j++){
                  if (arr[smallest]>arr[j]){
                      smallest=j;
                  }
              }
              int temp=arr[smallest];
             arr[ smallest]=arr[i];
             arr[i]=temp;



        }System.out.println("\nThe sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
