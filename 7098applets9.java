import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
class DrawOvalsExample extends Applet{
 
 public void paint(Graphics g){
 
 
 setForeground(Color.red);
 
 g.drawOval(10,10,50,100);
  g.fillOval(100,20,50,100);
 
 }
}