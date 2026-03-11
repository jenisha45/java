import java.util.Iterator;
import java.util.Vector;

public class Vectorclass {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Vector v= new Vector();
        System.out.println("inital capacity="+v.capacity());
        v.add("jenisha");
        v.add("hehe");
        v.add("heheuuu");
        v.add(2);
        v.add(23);
        System.out.println(v);
        System.out.println();
        System.out.println("using loop");
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println();
        System.out.println("using iterator method");
        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
