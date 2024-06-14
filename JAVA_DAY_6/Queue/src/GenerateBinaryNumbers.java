import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void generateBinaryNumbers(int n) {

        Queue<String> queue = new LinkedList<>();


        queue.add("1");


        for (int i = 0; i < n; i++) {

            String current = queue.poll();

            System.out.println(current);

            queue.add(current + "0");


            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        generateBinaryNumbers(n);
    }
}
