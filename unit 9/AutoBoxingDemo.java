public class AutoBoxingDemo {
    public static void main(String[] args) {
         int s= 55;

        @SuppressWarnings("deprecation")
        Integer i= new Integer(s);
        System.out.println(i);
    }
}
