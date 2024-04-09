import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class sumDiff extends JFrame {

    private JTextField num1TF, num2TF;
    private JLabel num1L, num2L, resultL;

    public sumDiff() {
        setTitle("Sum and Difference Calculator");
        setLayout(null);

        num1L = new JLabel("Number 1");
        num2L = new JLabel("Number 1");

        num1TF = new JTextField();
        num2TF = new JTextField();
        resultL = new JLabel(" Click here to get sum and difference");

        num1L.setBounds(20, 10, 100, 100);
        num2L.setBounds(20, 30, 100, 100);

        num1TF.setBounds(80, 50, 100, 25);
        num2TF.setBounds(80, 70, 100, 25);
        resultL.setBounds(80, 60, 200, 100);

        add(num1L);
        add(num2L);
        add(num1TF);
        add(num2TF);
        add(resultL);

        // addMouseListener is adding a mouse listener to the `resultL` JLabel.
        resultL.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Sum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Difference();
            }
        });

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Function when mouse is Pressed
    private void Sum() {
        try {
            int num1 = Integer.parseInt(num1TF.getText());
            int num2 = Integer.parseInt(num2TF.getText());
            int sum = num1 + num2;
            resultL.setText(" Mouse is Pressed Sum is: " + sum);
        } catch (NumberFormatException ex) {
            resultL.setText("Invalid input. Please enter integers.");
        }
    }

    // Function when mouse is Released
    private void Difference() {
        try {
            int num1 = Integer.parseInt(num1TF.getText());
            int num2 = Integer.parseInt(num2TF.getText());
            int difference = num1 - num2;
            resultL.setText(" Mouse is Released Difference is: " + difference);
        } catch (NumberFormatException ex) {
            resultL.setText("Invalid input. Please enter integers.");
        }
    }

    public static void main(String[] args) {
        new sumDiff();
    }
}
