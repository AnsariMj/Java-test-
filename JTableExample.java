import javax.swing.JFrame;
import javax.swing.JTable;

public class JTableExample extends JFrame {

  JTableExample() {
    String column[] = { "DI", " NAME", "SALARY" };

    String data[][] = {
      { "105", "MJ ANsARI", "78500" },
      { "106", "AYAN ANsARI", "25789" },
      { "107", "HASNAIN ANsARI", "257809" },
    };

    JTable JT = new JTable(data, column);
    JT.setBounds(50, 105, 200, 300);
    add(JT);
    setSize(400, 500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new JTableExample();
  }
}
