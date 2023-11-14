import java.applet.*;
import java.awt.*;

public class RectangleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 200, 100);
    }
}
/*<applet code="RectangleApplet.class" width="400" height="400"></applet> */