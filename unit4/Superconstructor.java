package unit4;
class Constructor1
{
    Constructor1()
    {
        System.out.println("hehe");
    }
}
class Constructor2 extends Constructor1
{
    Constructor2()
    {
        super();
        System.out.println("hello");
    }
}

public class Superconstructor {
    public static void main(String[] args) {
        // Constructor2 obj= new Constructor2();
        
    }
}
