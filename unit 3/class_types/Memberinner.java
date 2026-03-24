package class_types;
// type of class where another class can be defined in same class
class Outerlayer{
    void show(){
        System.out.println("hello this is outer class");
        Innerlayer obj=new Innerlayer();
        obj.display();
    }
class Innerlayer
{
    void display()
    {
        System.out.println("hello this is inner class");
    }
}
}
public class Memberinner {
    public static void main(String[] args) {
        Outerlayer in= new Outerlayer();
        in.show();
    }
}
