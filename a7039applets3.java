/*
<applet code="a7039applets3.class" width=500 height=500>
</applet>
*/
import java.awt.*;
import java.applet.*;

public class a7039applets3 extends Applet {

	public void init()
	{
		// set size
		setSize(300, 300);

		repaint();
	}

	// paint the applet
	public void paint(Graphics g)
	{
		// set Color for rectangle
		g.setColor(Color.red);

		// draw a ellipse
		// g.drawOval(100, 100, 150, 100);
        	g.drawOval(50,50,150,100);

	}
}
