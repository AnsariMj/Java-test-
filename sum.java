import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class sum extends JFrame {
    private JLabel num1L, num2L, resultL;
    private JTextField num1tf, num2tf, resulttf;
    private JButton sumBtn;

    public sum() {
        setTitle("Sum Numbers");
        setLayout(null);

        num1L = new JLabel("Number 1 :");
        num2L = new JLabel("Number 2 :");
        resultL = new JLabel("Result :");

        num1tf = new JTextField();
        num2tf = new JTextField();
        resulttf = new JTextField("Sum....");
        sumBtn = new JButton("Sum");

        num1L.setBounds(50, 20, 80, 25);
        num2L.setBounds(50, 40, 80, 25);
        resultL.setBounds(50, 60, 80, 25);

        num1tf.setBounds(150, 20, 80, 25);
        num2tf.setBounds(150, 40, 80, 25);
        resulttf.setBounds(150, 60, 80, 25);
        sumBtn.setBounds(150, 90, 100, 25);

        sumBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sumNumbers();
            }
        });

        add(num1L);
        add(num2L);
        add(resultL);
        add(num1tf);
        add(num2tf);
        add(resulttf);
        add(sumBtn);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void sumNumbers() {
        try {
            int num1 = Integer.parseInt(num1tf.getText());
            int num2 = Integer.parseInt(num2tf.getText());
            int result = num1 + num2;

            resulttf.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resulttf.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new sum();
    }
}
