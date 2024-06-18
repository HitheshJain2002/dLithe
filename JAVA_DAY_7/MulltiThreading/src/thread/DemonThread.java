package thread;

public class DemonThread extends Thread{
     @Override
    public void run(){
       if (Thread.currentThread().isDaemon()){
             System.out.println("IS THIS DEMON THREAD!.......");
         }
         else{
           System.out.println("This is a Child Thread of Main thread");


        }

    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Thread t=new DemonThread();
        t.setDaemon(false);
        t.start();
    }
}
