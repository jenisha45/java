package unit5;

public class Tryandcatchdemo {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException ef) {
            System.out.println("cannot divide by zero");
            System.err.println(ef.getMessage());
        }
        finally
        {
            System.out.println("i am a finally block which will run in any condition");
        }
        try {
            int ab[]={1,2,3,4,44,5};
            System.out.println(ab[13]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of index");
            System.out.println(e.getMessage());
        }
    }
}
