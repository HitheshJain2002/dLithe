package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    // Check if the stack is empty
    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // Push an element onto the stack
    public static void push(int data) {
        list.add(data);
    }

    // Pop an element from the stack
    public static int pop() {
        if (isEmpty()) {
            return -1; // or throw an exception
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // Peek at the top element of the stack
    public static int peek() {
        if (isEmpty()) {
            return -1; // or throw an exception
        }
        return list.get(list.size() - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();
        stack.push(45);
        stack.push(78);
        stack.push(56);
        System.out.println("Elements in stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.push(45);
        stack.push(78);
        System.out.println("Peeking the element:");
        System.out.println(stack.peek());
        System.out.println("Popping the element:");
        System.out.println(stack.pop());
    }
}
