package queue;

import java.util.Stack;

public class Queue2Stack<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public Queue2Stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(T item) {
        stack1.push(item);
    }

    // Dequeue operation
    public T dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        Queue2Stack<Integer> queue = new Queue2Stack<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Outputs 1
        System.out.println(queue.dequeue()); // Outputs 2

        queue.enqueue(4);

        System.out.println(queue.dequeue()); // Outputs 3
        System.out.println(queue.dequeue()); // Outputs 4
    }
}
