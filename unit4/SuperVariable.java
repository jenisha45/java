package unit4;

class App
{
    int a=9090;
    void show()
     {System.out.println("hello");
}
}
class App2 extends App
{
    void disp()
    {
        System.out.println("hehe");
        System.err.println(super.a);
    }
}
public class SuperVariable {
    public static void main(String[] args) {
        App2 obj=new App2();
        obj.disp();
        obj.show();
    }
}
