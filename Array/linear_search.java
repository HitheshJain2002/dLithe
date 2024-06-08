import java.util.Scanner;

public class linear_search {
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
        System.out.println("enter the Key");
        int key=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==key){
                System.out.print("KEY found at "+i +" "+"and key"+" "+key);
                return;
            }






        }
        System.out.println("No key Found");
    }
}
