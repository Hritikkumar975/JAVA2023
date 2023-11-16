import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

class Applet_12 extends Applet {
    public void paint(Graphics g) {
        // Cast Graphics to Graphics2D for more advanced shapes
        Graphics2D g2d = (Graphics2D) g;

        // Draw a rounded rectangle with the specified coordinates and dimensions
        int x = 50;
        int y = 50;
        int width = 200;
        int height = 100;
        int arcWidth = 30; // The width of the arc
        int arcHeight = 30; // The height of the arc

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(x, y, width, height, arcWidth, arcHeight);
        g2d.draw(roundedRectangle);
    }
}