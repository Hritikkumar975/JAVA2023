// Create an applet in Java to draw a circle.
import java.applet.Applet;
import java.awt.*;

public class CircleApplet extends Applet {
    public void paint(Graphics g) {
        // Set the color of the circle to red
        g.setColor(Color.RED);

        // Draw a circle with center at (x, y) and radius 50
        int x = 100;
        int y = 100;
        int radius = 50;
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
