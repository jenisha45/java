package unit4;

final class Apple
{
    void disp()
    {
        System.out.println("hehe parent class with final keyword");
    }
}
//here parent class can not be extended due to the use of final key-word
// class child extends Apple{
//  void disp()
//     {
//         System.out.println("hehe parent class with final keyword");
//     }
// }
public class Finalclass {
    public static void main(String[] args) {
        Apple obj=new Apple();
        obj.disp();

    }
}
