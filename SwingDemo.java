
// import java.awt.BorderLayout;
// import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingDemo extends JFrame {
    public SwingDemo() {
        setTitle("GRID LAYOUT");
        JPanel panel = new JPanel();

        // panel.setLayout(new FlowLayout());
        // setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(2, 3));

        // FLOW
        // panel.add(new JButton("Button 1"));
        // panel.add(new JButton("Button 2"));
        // panel.add(new JButton("Button 3"));
        // panel.add(new JButton("Button 4"));
        // panel.add(new JButton("Button 5"));

        // // BorderLayout
        // add(new JButton("East"), BorderLayout.EAST);
        // add(new JButton("West"), BorderLayout.WEST);
        // add(new JButton("North"), BorderLayout.NORTH);
        // add(new JButton("South"), BorderLayout.SOUTH);
        // add(new JButton("Center"), BorderLayout.CENTER);

        // Grid
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));

        // Flow
        // add(panel);

        // Border (No Panel)
        // xxxx

        // Grid
        add(panel);

        // Same for All
        setSize(200, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        // new FlowDemo();
        // new BorderDemo();
        // new GridDemo();

        new SwingDemo();
    }
}
