package unit4;
class Var
{
    final int a=90;//a value can not be change as final is used as const of C
    void method()
    {
        int b=80;
        System.out.println(+a);
        System.out.println("before changing="+b);
        b=3;
        System.out.println("ater  changing ="+b);

    }
}
public class Finalvariable {
    public static void main(String[] args) {
        Var a=new Var();
        a.method();
    }
}
