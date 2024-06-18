package Thread_sleep;

public class MultiThread {
    public static void main(String[] args)throws InterruptedException {
        Physical p=new Physical();
        p.start();
        p.join();

        Written w=new Written();
        w.start();
        w.join();

        Medical m=new Medical();
        m.start();
        m.join();
    }
}

class Physical extends Thread{
    public void run() {
        System.out.println("Physical exam starts");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Physical exam ended.");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Written extends Thread{
    public void run() {
        System.out.println("Written exam starts");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Written exam ended.");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Medical extends Thread{
    public void run() {
        System.out.println("Medical exam starts");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Medical exam ended.");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}