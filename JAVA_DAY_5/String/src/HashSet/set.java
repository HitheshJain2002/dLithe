package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        System.out.println("Enter the number of elements:");
        int numberOfElements = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.println("Enter the elements:");
        for (int i = 0; i < numberOfElements; i++) {
            set.add(sc.nextLine());
        }

        sc.close();

        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }

        LinkedHashSet l = new LinkedHashSet();
        l.add("hit");

    }
}