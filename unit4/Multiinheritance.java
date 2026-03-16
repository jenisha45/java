package unit4;

import java.util.Scanner;

interface Apple1
{
    void evenodd(int a);
}
interface Apple2
{
    void sum(int b); 
}

public class Multiinheritance implements Apple1,Apple2 {
    public void evenodd(int a)
    {
        if (a%2==0)
        {
            System.err.println("even number");
        }
        else{
            System.err.println("odd number");
        }
    }
    public void sum(int b)
    {int sum=0;
        for(int i=1;i<=b;i++)
        {
            sum += i;
        }
        System.err.println("sum of the given number ="+sum);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int n,m;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number you want to check even or odd=");
        n=input.nextInt();
        Multiinheritance obj=new Multiinheritance();
        obj.evenodd(n);
        System.out.println("enter the number you want to find the sum of natural number upto=");
        m=input.nextInt();
        obj.sum(m);
    }
}
