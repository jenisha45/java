package unit7;
 
class Runnableinterface implements Runnable
{
    public void run()
    {
        System.out.println("child thread");
    }
}
public class Threadrunnable {
    public static void main(String[] args) {
        Runnableinterface obj= new Runnableinterface();
        Thread t= new Thread(obj);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("this is child's main threads");
        }
    }
}
