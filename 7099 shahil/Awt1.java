import java.applet.Applet;
import java.awt.*;

// <applet code = Awt1.java width ="200" height = "200">
//  </applet>
public class Awt1 extends Applet {
  public void init() {
    setLayout(new FlowLayout());

    Button button = new Button("Click me!");

    
    add(button);

    

  }}
