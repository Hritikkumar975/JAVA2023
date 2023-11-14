import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

 class FontDisplayAWTExample {

    public static void main(String[] args) {
        Frame frame = new Frame("Font Display Example");

        FontDisplayCanvas canvas = new FontDisplayCanvas();
        frame.add(canvas);

        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null); 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}

class FontDisplayCanvas extends java.awt.Canvas {

    public void paint(Graphics g) {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        int y = 30;

        for (String fontName : fontNames) {
            Font font = new Font(fontName, Font.PLAIN, 14);
            g.setFont(font);
            g.drawString("Font: " + fontName, 30, y);
            y += 20;
        }
    }
}
