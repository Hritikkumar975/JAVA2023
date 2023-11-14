
// Create a simple AWT application that displays a TextField with Custom Layout.

import java.awt.Frame;
import java.awt.TextField;
import java.awt.LayoutManager;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

class CustomLayoutManager implements LayoutManager {
    
    public void addLayoutComponent(String name, Component comp) {}

    
    public void removeLayoutComponent(Component comp) {}

    
    public Dimension preferredLayoutSize(Container parent) {
        return new Dimension(200, 50);
    }

    public Dimension minimumLayoutSize(Container parent) {
        return new Dimension(100, 30);
    }

    
    public void layoutContainer(Container parent) {
        Component[] components = parent.getComponents();

        int x = 100;
        int y = 100;

        for (Component component : components) {
            component.setBounds(x, y, 200, 50);
        }
    }
}

class CustomLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Custom Layout Example");
        frame.setLayout(new CustomLayoutManager());

        TextField textField = new TextField("Custom TextField");
        frame.add(textField);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
