package unit7;

class ThreadprioritiesDemo extends Thread {
public void run()
{
    System.out.println("inside the run() method");
}
}

public class Threadpriorities {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("main thread");
        ThreadprioritiesDemo t1 = new ThreadprioritiesDemo();
        ThreadprioritiesDemo t2 = new ThreadprioritiesDemo();
        ThreadprioritiesDemo t3 = new ThreadprioritiesDemo();
        System.out.println("priority of t1=" + t1.getPriority());
        System.out.println("priority of t2=" + t2.getPriority());
        System.out.println("priority of t3=" + t3.getPriority());

        t1.setPriority(4);
        t2.setPriority(8);
        t3.setPriority(7);
        System.out.println("priority of t1=" + t1.getPriority());
        System.out.println("priority of t2=" + t2.getPriority());
        System.out.println("priority of t3=" + t3.getPriority());
    }
}
