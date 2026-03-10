
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
         try {
    FileWriter fw= new FileWriter("C:\\java\\file2.txt");
      String s="hi this is me";
      fw.write(s);
      fw.close();
      System.out.println("successfully written");
    } catch (IOException e) {
      System.out.println(e);
    }
    }
}
