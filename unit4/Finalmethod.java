package unit4;
class Method{

  final void another()
{
    System.out.println("hello. this can not be changed");
}
}
//here another class which is extend of parent class can not be used as final keyword doesnot allow to override its method
//   class Method2 extends Method{ 

//    void another()
// {
//     System.out.println("hello. this can not be changed");
// }
// }
  
public class Finalmethod {
    public static void main(String[] args) {
        Method obj=new Method();
        obj.another();

    }
}
