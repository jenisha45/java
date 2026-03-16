package unit4;

class Parent1
 {
void disp()
        {
            System.out.println("parent class");
        }
    }

    class Child extends Parent1 {
        void show() {
            System.out.println("Child class");
        }
    }

public class Singleinheritance
 {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.disp();
        obj.show();
    }
}
