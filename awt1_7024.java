/* Create a simple awt application that display a button with Flowlayout manager. */
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class awt1_7024 {
    public static void main(String[] args) {
        
        Frame frame = new Frame("Button Example");

        
        frame.setLayout(new FlowLayout());

        
        Button button = new Button("Click here!");

        
        frame.add(button);

        
        frame.setSize(350, 250);

        
        frame.setVisible(true);
    }
}