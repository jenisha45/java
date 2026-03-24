package class_types;
//class in which another class can be created inside the object of the parent class 
class A
{
    void show()
    {
        System.err.println("hello parent class");
    }
}
class B
{
    A obj=new A()
    {
       @SuppressWarnings("unused")
    public void display()
        {
            System.err.println("this is child class or Anonymous class");
        }
    };
    void show2()
    {
        obj.show();
    }
}
public class Anonymous {
    public static void main(String[] args) {
       B obj2= new B();
       obj2.show2();

    }
}
