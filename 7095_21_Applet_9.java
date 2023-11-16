import java.applet.Applet;
import java.awt.Graphics;

class Applet_9 extends Applet {
    public void paint(Graphics g) {
        // Draw an oval with the specified coordinates and dimensions
        int x = 50;
        int y = 50;
        int width = 200;
        int height = 100;
        g.drawOval(x, y, width, height);
    }
}