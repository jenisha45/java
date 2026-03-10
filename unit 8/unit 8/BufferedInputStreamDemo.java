import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
           try {
               FileInputStream fin = new FileInputStream("C:\\java\\file1.txt");
               BufferedInputStream bis = new BufferedInputStream(fin);
        int i;
        while ((i=bis.read())!=-1) {
            System.out.print((char) i);
        }
        fin.close();
        bis.close();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
