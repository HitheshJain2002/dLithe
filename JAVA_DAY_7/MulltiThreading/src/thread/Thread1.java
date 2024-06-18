package thread;

public class Thread1 {

    public static void main(String[] args) {
        mythread1 t1=new mythread1();
        t1.start();
        Mythread2 t2=new Mythread2();
        t2.start();
    }
}
    class mythread1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " ");
            }
        }
    }

 class Mythread2 extends Thread {

     public void run() {
         for (int i = 6; i < 10; i++) {
             System.out.println(i + " ");
         }
     }
 }

