// Program to draw a smiling face using Graphics class methods.
import java.applet.Applet;
import java.awt.*;
 public class applets15_7074 extends Applet{
    public void paint(Graphics g){
        g.drawOval(500,200,350,350);
        g.drawOval(570,290,65,65);
        g.drawOval(710,290,65,65);
        g.drawLine(570,260,650,290);
        g.drawLine(780,260,695,290);
        g.drawLine(675,370,675,420);
        g.drawArc(625, 400,100,100,190,160);
    }
}
/* <applet code="applets15_7074.class" width="1000" height="1000"> </applet> */
    