public class WrapperDemo {
    public static void main(String[] args) {
        String s= "55";

        int i= Integer.parseInt(s);
        System.out.println(i);
        double d= Double.parseDouble(s);
        System.out.println(d);

        boolean b= Boolean.parseBoolean(s);
        System.out.println(b);
    }
}
