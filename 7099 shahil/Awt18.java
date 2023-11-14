import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code = Awt18.java width ="200" height = "200">
//  </applet>
public class Awt18 extends Applet {
  public void init() {
    setLayout(new GridLayout(5, 4, 5, 5));

    TextField textField = new TextField(20);

    add(textField);

    Button button1 = new Button("1");
    Button button2 = new Button("2");
    Button button3 = new Button("3");
    Button button4 = new Button("4");
    Button button5 = new Button("5");
    Button button6 = new Button("6");
    Button button7 = new Button("7");
    Button button8 = new Button("8");
    Button button9 = new Button("9");
    Button button0 = new Button("0");
    Button buttonAdd = new Button("+");
    Button buttonSubtract = new Button("-");
    Button buttonMultiply = new Button("*");
    Button buttonDivide = new Button("/");
    Button buttonEquals = new Button("=");
    Button buttonClear = new Button("C");

    add(button1);
    add(button2);
    add(button3);
    add(buttonAdd);
    add(button4);
    add(button5);
    add(button6);
    add(buttonSubtract);
    add(button7);
    add(button8);
    add(button9);
    add(buttonMultiply);
    add(button0);
    add(buttonEquals);
    add(buttonClear);
    add(buttonDivide);

   
    setSize(300, 200);

    setVisible(true);
  }

}
