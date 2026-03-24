package class_types;
public class Staticnested {
    static int b=90;
    int a=80;
    static class Demo
    {
        void display()
        {

            System.out.println("int b="+b);
            // System.out.println("int a="+a); this can not run cuz its not static variable 
        }
    }

    public static void main(String[] args) {
        Staticnested.Demo obj=new Staticnested.Demo();
        obj.display();
    }
}
