package unit7;

class Threademo extends Thread {
    public void run() {
        System.out.println("thread=" + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("monica");
        }
    }
}

public class Threadexample {
    public static void main(String[] args) {
        System.out.println("thread=" + Thread.currentThread().getName());
        Threademo tr= new Threademo();
        tr.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("jenisha");
        }
    }
}

