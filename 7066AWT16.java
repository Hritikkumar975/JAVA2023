import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class SimpleAWTApp {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT Application");
        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());
        // Create a TextArea
        TextArea textArea = new TextArea("This is a TextArea.", 10, 30);
        // Add the TextArea to the Frame
        frame.add(textArea);
        // Handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        // Set the size of the Frame
        frame.setSize(300, 200);
        // Make the Frame visible
        frame.setVisible(true);
    }
}
