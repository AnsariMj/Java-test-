import java.applet.Applet;
import java.awt.Graphics;

public class Applets extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello, this is a simple Java applet!", 20, 20);
    }
}