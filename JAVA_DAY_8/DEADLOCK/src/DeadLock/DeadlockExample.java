package DeadLock;

class A {
    public synchronized void di(B b) {
        System.out.println("thread1 start execution of di() method");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread1 trying to call last()");
        b.last();
    }

    public synchronized void last() {
        System.out.println("inside A, this is last method");
    }
}

class B {
    public synchronized void d2(A a) {
        System.out.println("thread2 start execution of d2() method");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread2 trying to call a.last()");
        a.last();
    }

    public synchronized void last() {
        System.out.println("inside B, this is last method");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        final A a = new A();
        final B b = new B();

        // Thread-1 tries to lock a then b
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                a.di(b);
            }
        });

        // Thread-2 tries to lock b then a
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                b.d2(a);
            }
        });

        t1.start();
        t2.start();
    }
}