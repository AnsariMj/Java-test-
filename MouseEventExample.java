import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseEventExample extends JFrame implements MouseListener {

  JLabel label;
  JTextField textFfField;
  JButton JButton;

  MouseEventExample() {
    setTitle("Action Event Example");
    setLayout(null);

    label = new JLabel("Click on Button to Perform Action");
    textFfField = new JTextField();
    JButton = new JButton(" Click here");

    label.setBounds(20, 30, 80, 25);
    textFfField.setBounds(20, 60, 80, 25);
    JButton.setBounds(20, 90, 80, 25);
    JButton.addMouseListener(this);

    add(label);
    add(textFfField);
    add(JButton);

    setVisible(true);
    setSize(300, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void mousePressed(ActionEvent e) {
    textFfField.setText("Welcome");
  }

  public static void main(String[] args) {
    new MouseEventExample();
  }
}
