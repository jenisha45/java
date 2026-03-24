package class_types;
// class which can be created inside the method of the another class
class Memberlocalinner
{
    int j=0;
    void display()
    {
        class Local
        {
            void show()
            {
                System.out.println("outer="+j);
                System.out.println("local class");
            }
        }
        Local obj=new Local();
        obj.show();
    }
}
public class Memberlocal {
    public static void main(String[] args) {
        Memberlocalinner in=new Memberlocalinner();
        in.display();
    }
}
