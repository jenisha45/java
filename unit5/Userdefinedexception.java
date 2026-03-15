package unit5;

import java.util.Scanner;

public class Userdefinedexception {
    int balance;
    void withdraw(int a)
    {
        try {
            if(a>balance)
               { throw new Lessbalance(a,balance);}
        balance=balance-a;
        System.out.println("amt remaining :"+balance);
        } catch (Lessbalance e) {
            System.err.println("enter amount less than :"+balance);
        }
    }
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Userdefinedexception obj=new Userdefinedexception();
        System.out.println("enter the balance:");
        obj.balance=input.nextInt();
        System.out.println("amount to withdraw:");
        int amt=input.nextInt();
        obj.withdraw(amt);
        
    }
}
    class Lessbalance extends Exception
    {
        Userdefinedexception ob=new Userdefinedexception();
        public Lessbalance(int a,int b)
        {
            System.out.println("your balance:"+b+" and u want to withdraw:"+a);
        }
    }
