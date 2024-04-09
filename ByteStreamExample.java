import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

  public static void main(String[] args) throws IOException {
    try (
      FileInputStream fis = new FileInputStream("source.txt");
      FileOutputStream fos = new FileOutputStream("destination.txt")
    ) {
      int charRead;
      while ((charRead = fis.read()) != -1) {
        fos.write(charRead);
      }

      System.out.println("Byte Stream File copied successfully!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
