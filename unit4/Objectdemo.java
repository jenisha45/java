package unit4;
public class Objectdemo {
    @SuppressWarnings({ "deprecation", "rawtypes" })
    public static void main(String[] args) {
        Object a=new String("java");
        Object b=new Integer(9);
        Object c=new Float(9.9);
        Object d=new Double(99.9);

        Class aa=a.getClass();

      System.out.println(""+aa);
      System.out.println(""+b);
      System.out.println(""+c);
      System.out.println(""+d);
    }
}
