package unit4;

class Parent
{
    void disp()
    {
        System.out.println("hello parent class");
    }
}
class Child1 extends Parent
{
    void disp1()
    {
        System.out.println("hello Child1 class");
    }
}
class Child2 extends Parent
{
    void disp2()
    {
        System.out.println("hello Child2 class");
    }
}
public class Hierarchiacalinheritance {
    public static void main(String[] args) {
        Child1 obj1=new Child1();
        Child2 obj2=new Child2();
        obj1.disp();
        obj1.disp1();
        obj2.disp();
        obj2.disp2();
    }
}
