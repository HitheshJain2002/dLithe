package ThreadProblem;

public class problem1 {
    public static void main(String[] args) {
        TotalEarn t = new TotalEarn();
        t.start();
        System.out.println("Total earning: " + t.total);
    }
}

class TotalEarn extends Thread {
    int total = 0;
    public void run() {
        for (int i = 0; i < 10; i++) {
            total += 100;
        }
    }
}