
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
   public static void main(String[] args) {
    try {
      FileOutputStream fot = new FileOutputStream("C:\\java\\file.txt");
      String s="helooooooooooooooooooooooooo";
      byte b[]=s.getBytes();
      fot.write(b);
      fot.close();
      System.out.println("successfully written");
    } catch (IOException e) {
      System.out.println(e);
    }
   } 
}
