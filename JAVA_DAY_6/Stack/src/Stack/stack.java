package Stack;


import java.util.Scanner;

public class stack {
    private int top;
    private static int[] arr;
    public stack(int capacity){
        top=-1;
        arr=new int[capacity];
    }
    public stack(){
        this(10);
    }
    public void push(int item){
        if(isFull()){
           throw new RuntimeException("stack is Overflow.......!");

        }top++;
        arr[top]=item;

    }


    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is underflow.........");
        }

        int item=arr[top];
        top--;

        return item;
    }

    private boolean isEmpty() {
        return top == -1;
    }
    private boolean isFull() {
        return top == arr.length - 1;
    }
                    public int peek(){
                        if(isEmpty()){
                            throw new RuntimeException("stack is underflow.........");
                        }
                        return arr[top];
                    }


    public static void main(String[] args) {
        stack s=new stack();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            s.push(sc.nextInt());
        }
        System.out.println("element in stack:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(s.arr[i]);

        }
        System.out.println("peeking the element:");
        System.out.println(s.peek());
        System.out.println("poping the element:");
        System.out.println(s.pop());
        System.out.println("elements in stack");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+s.arr[i]+"]");
        }
    }
}
