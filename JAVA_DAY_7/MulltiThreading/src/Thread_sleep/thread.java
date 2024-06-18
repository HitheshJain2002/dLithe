package Thread_sleep;

public class thread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().interrupted());
        try{
            for (int i = 0; i < 05; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        thread t=new thread();
        t.start();
       t.interrupt();
    }
}
