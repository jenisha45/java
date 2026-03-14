package unit6;
public class Stringbufferdemo {
    public static void main(String[] args) {
        StringBuffer Stringbufferobj= new StringBuffer();
        System.out.println("length="+Stringbufferobj.length());
        System.out.println("by default capacity of the sting buffer ="+Stringbufferobj.capacity());
        
        StringBuffer sb=new StringBuffer("hello");
        System.out.println("length="+sb.length());
        System.out.println("capacity="+sb.capacity());
        System.out.println("original text="+sb);
        sb.append("programming");

        System.out.println(sb);
        sb.insert(4, "java");
        System.out.println(sb);
        sb.replace(0, 5, "rli");
        System.out.println("replaced text="+sb);
        sb.reverse();
        System.out.println("reverse stringbuffer content="+sb);
        
    }
}
