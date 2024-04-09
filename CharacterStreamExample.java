import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

  public static void main(String[] args) throws IOException {
    try (
      FileReader in = new FileReader("source.txt");
      FileWriter out = new FileWriter("destination.txt");
    ) {
      int byteRead;
      while ((byteRead = in.read()) != -1) {
        out.write(byteRead);
      }
      System.out.println("Character Stream File Copied successfully");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
