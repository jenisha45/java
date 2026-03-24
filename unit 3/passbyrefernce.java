public class passbyrefernce {
        int a=10;
    void Update(int b){
        a=a+b;
    }
    public static void main(String[] args){
       passbyrefernce obj=new passbyrefernce();
       System.out.println("befor="+obj.a);
       passbyrefernce obj1;
       obj1=obj;
       obj1.Update(20);
       System.out.println("after="+obj.a);
    }
}