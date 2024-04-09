import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloFrame3 extends JFrame {

  JLabel p, t, r, result;
  JTextField pt, tt, rt, resultt;
  JButton b1;

  HelloFrame3() {
    setSize(600, 200);
    setTitle("ActionListener");
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    p = new JLabel("Principal");
    t = new JLabel("Time");
    r = new JLabel("Rate");
    result = new JLabel("RESULT");
    b1 = new JButton("CALCULATE");

    pt = new JTextField(15);
    tt = new JTextField(15);
    rt = new JTextField(15);
    resultt = new JTextField(15);

    p.setBounds(100, 100, 100, 30);
    t.setBounds(100, 130, 100, 30);
    r.setBounds(100, 160, 100, 30);
    result.setBounds(100, 190, 100, 30);

    pt.setBounds(200, 100, 100, 30);
    tt.setBounds(200, 130, 100, 30);
    rt.setBounds(200, 160, 100, 30);
    resultt.setBounds(200, 200, 100, 30);
    b1.setBounds(100, 500, 100, 30);

    add(p);
    add(t);
    add(r);
    add(result);
    add(pt);
    add(tt);
    add(rt);
    add(resultt);
    add(b1);

    b1.addKeyListener(
      new KeyListener() {
        public void keyPressed(KeyEvent e) {
          CalculateSI();
        }

        public void keyReleased(KeyEvent e) {
          CalculateSI();
        }

        public void keyTyped(KeyEvent e) {
          CalculateSI();
        }
      }
    );
  }

  public void CalculateSI() {
    try {
      double p = Double.parseDouble(pt.getText());
      double t = Double.parseDouble(tt.getText());
      double r = Double.parseDouble(rt.getText());
      double cal = ((p * t * r) / 100);
      resultt.setText(String.valueOf(cal));
    } catch (NumberFormatException ex) {
      result.setText("Invalid Input");
    }
  }

  public static void main(String[] args) {
    new HelloFrame3();
  }
}
