import java.applet.applet;
import java.awt;

import java.awt.color;
import java.awt.Graphics;

public class applletarc
{
    public void paint(Graphics g){
        setForeground(Color.red);
        g.drawArc(10,10,50,100,10,45);
        g.fillArc(100,10,1000,100,0,90);

    }
}

