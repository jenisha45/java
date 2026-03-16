package unit4;
class Parent3
{
    int a=90,b=77;
    void add()
    {
        System.out.println("add="+(a+b));

    }
}
class Child3 extends Parent3
{
    void show()
    {
        System.out.println("jenisha kaharbuja");
        super.add();
    }
}

public class SuperClass {
    public static void main(String[] args) {
       Child3 obj=new Child3();
       obj.show();
    }
}
