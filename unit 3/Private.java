public class Private {
    public int a;
    public String b;
    private Private() {
        a=10;
        b="abc";
         System.out.println(+a+" "+b);
    }

        public static void main(String[] args) {
            @SuppressWarnings("unused")
            Private in= new Private();
            
        }

}