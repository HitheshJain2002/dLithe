package QueueAr;

public class QueueAr {
    static int arr[];
    static int size;
    static int rear = -1;

    public QueueAr(int n) {
        arr = new int[n];
        this.size = n;
    }

    public QueueAr() {
        this(10);
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static boolean isFull() {
        return rear == size - 1;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public static void main(String[] args) {
        QueueAr queue = new QueueAr(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove()); // 1
        System.out.println(queue.remove()); // 2
        System.out.println(queue.remove()); // 3
        System.out.println(queue.remove()); // queue is empty, -1
    }
    
}
