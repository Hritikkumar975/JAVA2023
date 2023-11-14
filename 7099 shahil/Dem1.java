import javax.swing.*;

public class Dem1 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Text in Frame");

    JLabel label = new JLabel("This is some text!");

    frame.add(label);

    frame.setSize(300, 100);

    frame.setVisible(true);
  }
}

