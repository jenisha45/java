package unit7;

class ThreadlifecycleA extends Thread {
    public void run() {
        System.out.println("A Theard");
        for (int i = 0; i < 5; i++) {
            System.out.println("M in thread A");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("thread A is completed");
    }
}

class ThreadlifecycleB extends Thread {
    public void run() {
        System.out.println("B Theard");
        for (int i = 0; i < 5; i++) {
            System.out.println("N in thread B");
        }
        System.out.println("thread B is completed");
    }
}

public class Threadlifecycle {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        ThreadlifecycleA t1=new ThreadlifecycleA();
        ThreadlifecycleB t2= new ThreadlifecycleB();
        t1.start();
        t1.yield();
      try {
        t1.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      t2.start();
      System.out.println("Main thread end");
    }
}
