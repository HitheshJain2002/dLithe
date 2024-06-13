package Stack;

import java.util.Stack;

public class ReverseString {
    public static String Stringreverse (String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }


        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        System.out.println(Stringreverse("hello")); // olleh
        System.out.println(Stringreverse("world")); // dlrow
        System.out.println(Stringreverse("Stack"));


    }
}