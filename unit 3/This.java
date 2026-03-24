class Studen
{
    String name;
    int age;
    int roll;
    public Studen(String name, int age, int roll)
    {
        this.name=name;
        this.age=age;
        this.roll=roll;
    }
    public void display()
    {
      System.out.println("name="+name+"\n"+"age="+age+"\n"+"roll.no="+roll);  
    }    
}
public class This {
    public static void main(String[] args) {
        Studen in= new Studen("arpana", 10, 20);
        Studen in2= new Studen("jenisha", 18, 14);
        in.display();
        in2.display();
    }
}
