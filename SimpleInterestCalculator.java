import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleInterestCalculator extends JFrame {
    private JLabel principalLabel, rateLabel, timeLabel, resultLabel;
    private JTextField principalField, rateField, timeField, resultField;
    private JButton calculateButton;

    public SimpleInterestCalculator() {
        setTitle("Simple Interest Calculator");
        setLayout(null);

        principalLabel = new JLabel("Principal Amount:");
        rateLabel = new JLabel("Rate of Interest:");
        timeLabel = new JLabel("Time (in years):");
        resultLabel = new JLabel(" Output:");

        principalField = new JTextField();
        rateField = new JTextField();
        timeField = new JTextField();
        resultField = new JTextField();
        calculateButton = new JButton("Calculate");

        principalLabel.setBounds(50, 30, 120, 25);
        rateLabel.setBounds(50, 60, 120, 25);
        timeLabel.setBounds(50, 90, 120, 25);
        resultLabel.setBounds(50, 120, 120, 25);

        principalField.setBounds(180, 30, 80, 25);
        rateField.setBounds(180, 60, 80, 25);
        timeField.setBounds(180, 90, 80, 25);
        resultField.setBounds(180, 120, 80, 25);
        calculateButton.setBounds(150, 160, 100, 25);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSimpleInterest();
            }
        });

        add(principalLabel);
        add(rateLabel);
        add(timeLabel);
        add(resultLabel);
        add(principalField);
        add(rateField);
        add(timeField);
        add(resultField);
        add(calculateButton);

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void calculateSimpleInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());

            double simpleInterest = (principal * rate * time) / 100;
            resultField.setText(String.valueOf(simpleInterest));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleInterestCalculator();
    }
}
