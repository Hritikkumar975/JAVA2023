import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyEventsDemo extends Frame implements KeyListener {
    Label l = new Label("Text: ");
    KeyEventsDemo() {
        setTitle("Keyboard Events Demo");
        setSize(300, 200);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        add(l);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        String msg = l.getText();
        msg += keyChar;
        l.setText(msg);
        System.out.println("Key Typed: " + keyChar);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        new KeyEventsDemo();
    }
}