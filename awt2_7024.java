/* Create a simple awt application that display a button with Custom Layout. */
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class awt2_7024 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Layout Example");

        
        CustomLayoutManager customLayout = new CustomLayoutManager();

        
        Container container = frame.getContentPane();

    
        container.setLayout(customLayout);

        
        Button button = new Button("Click me!");

        
        container.add(button);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        
        frame.setSize(300, 200);

        
        frame.setVisible(true);
    }

    static class CustomLayoutManager implements LayoutManager {
        public void addLayoutComponent(String name, java.awt.Component comp) {
        }

        public void removeLayoutComponent(java.awt.Component comp) {
        }

        public Dimension preferredLayoutSize(java.awt.Container parent) {
            return null;
        }

        public Dimension minimumLayoutSize(java.awt.Container parent) {
            return null;
        }

        public void layoutContainer(java.awt.Container parent) {
            
            Rectangle bounds = parent.getBounds();

            
            int count = parent.getComponentCount();

            
            if (count > 0) {
                java.awt.Component component = parent.getComponent(0);
                component.setBounds(bounds.x + 50, bounds.y + 50, 250, 150);
            }
        }
    }
}