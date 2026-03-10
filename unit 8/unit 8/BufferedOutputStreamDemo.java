import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
         try {
      FileOutputStream fot = new FileOutputStream("C:\\java\\file1.txt");
      BufferedOutputStream bos= new BufferedOutputStream(fot);
      String s="hahahhahahahhahaha";
      byte b[]=s.getBytes();
      bos.write(b);
      bos.flush();
      bos.close();
      fot.close();
      System.out.println("successfully written");
    } catch (IOException e) {
      System.out.println(e);
    }
    }
}
