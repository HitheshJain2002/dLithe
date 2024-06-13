package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List l = new ArrayList();
        LinkedList ll=new LinkedList();// It's better to use generics to avoid warnings
        l.add(50);

        l.add("hlo");
        l.add(null);
        l.set(0,"nigga");
        /* Traverse the array */
        for (Object o : l) {
            System.out.println(o);
        }
        System.out.println("after the first loop:");

        l.add(45);
        l.add(0,45);

        l.remove(1); // Removes the element at index 1 ("hlo")

        System.out.println(l.contains(null)); // Check if the list contains 'null'

        LinkedList l2 = new LinkedList(); // Creating another list to demonstrate containsAll and removeAll
        l2.add(50);
        l2.add(45);

        System.out.println(l.containsAll(l2)); // Check if 'l' contains all elements of 'l2'

        System.out.println(l.removeAll(l2)); // Remove all elements in 'l' that are also in 'l2'

        System.out.println(l.isEmpty()); // Check if the list is empty

        l.clear();
        // Clear the list
        System.out.println(l.isEmpty()); // Check if the list is empty after clearing
l.add("hithansh");
        System.out.println(l.size());
        System.out.println("ARRAYlIST 1:");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i)+" ");
            System.out.println("done");
        }
        // Print the size of the list
        System.out.println("ARRAYlIST 2:");
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i)+" ");
        }

    }
}
