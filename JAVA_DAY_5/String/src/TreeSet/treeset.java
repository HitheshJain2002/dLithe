package TreeSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Set<Integer> t=new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n= sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            t.add(sc.nextInt());

        }
        System.out.println(t);
    }
}
