package unit4;

class Baseclass
{
    void sub(int a,int b)
    {
       System.out.println("subtraction="+(a-b)); 
    }
}
class Subclass extends Baseclass
{
    void mul(int a,int b)
    {
        System.out.println("Multiplication="+(a*b));
    }
}
class Subclass2 extends Subclass
{
    void add(int a,int b)
    {
        System.out.println("Division="+(a/b));
    }
}
public class Multilevelinheritance {
    public static void main(String[] args) {
        Subclass obj=new Subclass2();
        obj.sub(40, 10);
        obj.mul(15, 07);
    }
}
