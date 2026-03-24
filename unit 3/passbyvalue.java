public class passbyvalue {
    public static void main(String[] args){
        int a=10;
       System.out.println("befor="+a);
       passbyvalue obj=new passbyvalue();
       obj.change(a);
       System.out.println("after="+a);
    }
    void change(int b){
         b =80;
        System.out.println("inside="+b);
    }
}