import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBag extends JFrame {

  GridBag() {
    setTitle(" GridBag Layout");
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gb = new GridBagConstraints();

    JButton b1 = new JButton("Button 1");
    gb.gridx = 0;
    gb.gridy = 0;
    panel.add(b1, gb);

    JButton b2 = new JButton("Button 2");
    gb.gridx = 1;
    gb.gridy = 0;
    panel.add(b2, gb);

    add(panel);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(300, 200);
  }

  public static void main(String[] args) {
    new GridBag();
  }
}
