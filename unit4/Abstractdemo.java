package unit4;

abstract class Example
{
    abstract void apple();
    abstract void skip();
}
//basically we can declare another class or used the same class that we have the file from
// class Demo extends Example
// {
//    void method()
//         {
//             System.out.println("This abstraction class can only be used when its inside method are called");
//         }
//         void apple()
//         {
    
//         }
//         void skip()
//         {
    
//         }
//     }
    
    public class Abstractdemo extends Example
     {
        void method()
        {
            System.out.println("This abstraction class can only be used when its inside method are called");
        }
        void apple()
        {
    
        }
        void skip()
        {
    
        }
        public static void main(String[] args) {
            Abstractdemo obj=new Abstractdemo();
            obj.method();
        } 
    }
