package thread;

public class PriorityThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println();

    }
}







