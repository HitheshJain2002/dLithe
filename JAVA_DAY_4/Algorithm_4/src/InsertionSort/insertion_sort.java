package InsertionSort;

import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int low = arr[0];
        int high = arr[n - 1];
        System.out.println("enter the elements  of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The input array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println();

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current <= arr[j])  /* Move the elements greater than temp to one position ahead from their current position*/ {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }


        System.out.println("The output array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

