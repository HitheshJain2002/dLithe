package thread;

public class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName());
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("bhat");
        System.out.println(Thread.currentThread().getName());
        Thread2 t1=new Thread2();
        t1.start();
        System.out.println(Thread.currentThread().isAlive());
//        t1.setName("sumukt");
    }
}
