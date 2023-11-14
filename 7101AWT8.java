
//Create a simple AWT application that displays a Label with FlowLayout manager.




import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;


class FlowLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Flow Layout Example");
        frame.setLayout(new FlowLayout());

        Label label = new Label("This is a Label");
        frame.add(label);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
