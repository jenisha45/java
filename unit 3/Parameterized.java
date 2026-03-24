class Parameterized {
    int a;
    String b;
    Parameterized(int c,String d){
    a=c;
    b=d;
    }

    void display() {
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }

    public static void main(String[] args) {
        Parameterized obj = new Parameterized(10, "Ram");
        obj.display();
    }

}