package unit5;

public class Throwsandthrowdemo {
    public void disp(int age) throws Exception 
    {
        if(age<18 || age >70)
        {
            throw new Exception();
        }
        else
        {
            System.out.println("your age="+age);
        }
    }
    public static void main(String[] args) {
        
    }
}
