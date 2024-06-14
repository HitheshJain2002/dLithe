package thread;

public class MyThread {

    public static void main(String[] args) {
        // This main method can be left empty or used for different logic
    }

    protected void start() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "");
        }
    }
}
