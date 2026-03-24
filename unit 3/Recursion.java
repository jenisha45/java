import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
      int n,f;
      @SuppressWarnings("resource")
      Scanner input= new Scanner(System.in);
      System.err.println("Enter the number=");
      n=input.nextInt();
      f=fact(n);
      System.out.println("factorial of "+n+"="+f);
      
    }
    static int fact(int n)
    {
     if (n<=1)
        {
            return 1;
        }   
        else 
        {
         return n*fact(n-1);   
        }
    }
}
    