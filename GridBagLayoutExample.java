import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        // Adding a label
        JLabel label = new JLabel("Hello, GridBagLayout!");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2; // Spanning 2 columns
        panel.add(label, constraints);

        // Adding a button
        JButton button = new JButton("Click Me");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1; // Reset gridwidth
        panel.add(button, constraints);

        // Adding another button
        JButton anotherButton = new JButton("Another Button");
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(anotherButton, constraints);

        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
