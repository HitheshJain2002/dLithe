package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextLargestNumber {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int currentElement = s.elementAt(i);
            int nextLargestElement = -1;
            for (int j = i + 1; j < n; j++) {
                int nextElement = s.elementAt(j);
                if (nextElement > currentElement) {
                    nextLargestElement = nextElement;
                    break;
                }
            }
            res[i] = nextLargestElement;
        }

        System.out.print("resulting array: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}