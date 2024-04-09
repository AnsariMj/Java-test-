import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SumDifferenceCalculator extends JFrame {

  private JTextField num1Field, num2Field;
  private JLabel resultLabel;

  public SumDifferenceCalculator() {
    setTitle("Sum and Difference Calculator");
    setSize(300, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    num1Field = new JTextField(10);
    num2Field = new JTextField(10);
    resultLabel = new JLabel("Result will be displayed here");

    JPanel panel = new JPanel();
    panel.add(new JLabel("Number 1:"));
    panel.add(num1Field);
    panel.add(new JLabel("Number 2:"));
    panel.add(num2Field);
    panel.add(resultLabel);

    // Adding MouseListener to calculate and display sum/difference
    panel.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          calculateAndDisplaySum();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          calculateAndDisplayDifference();
        }
      }
    );

    add(panel);
    setVisible(true);
  }

  private void calculateAndDisplaySum() {
    try {
      int num1 = Integer.parseInt(num1Field.getText());
      int num2 = Integer.parseInt(num2Field.getText());
      int sum = num1 + num2;
      resultLabel.setText("Sum: " + sum);
    } catch (NumberFormatException ex) {
      resultLabel.setText("Invalid input. Please enter integers.");
    }
  }

  private void calculateAndDisplayDifference() {
    try {
      int num1 = Integer.parseInt(num1Field.getText());
      int num2 = Integer.parseInt(num2Field.getText());
      int difference = num1 - num2;
      resultLabel.setText("Difference: " + difference);
    } catch (NumberFormatException ex) {
      resultLabel.setText("Invalid input. Please enter integers.");
    }
  }

  public static void main(String[] args) {
    // SwingUtilities.invokeLater(() -> new SumDifferenceCalculator());
    // SwingUtilities.invokeLater(() -> );
    new SumDifferenceCalculator();
  }
}
