// Java Program to Handle MouseEvent
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseEventApplet extends Applet implements MouseListener, MouseMotionListener {
    int startX, startY, endX, endY;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(startX, startY, endX, endY);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Unused method in this example
    }
}
