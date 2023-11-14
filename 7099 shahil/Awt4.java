import java.applet.Applet;
import java.awt.*;
// <applet code = Awt4.java width ="200" height = "200">
//  </applet>

public class Awt4 extends Applet {
  public void init() {
    setLayout(new FlowLayout());

    TextField textField = new TextField("Enter text here", 20);

    add(textField);

    setSize(300, 100);

    setVisible(true);
  }

  
}
