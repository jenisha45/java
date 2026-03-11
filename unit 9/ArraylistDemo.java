import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArraylistDemo {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
         ArrayList<String> v= new ArrayList<String>();
        v.add("jenisha");
        v.add("hehe");
        v.add("heheuuu");
        v.add("2");
        v.add("23");
        System.out.println("size="+v.size());
        System.out.println();
        Collections.sort(v);
        System.out.println(v);
        System.out.println("using iterator method");
        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
