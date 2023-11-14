import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class txtfld {
    private JFrame frame;
    private JTextArea textArea;
    private JPasswordField passwordField;

    public txtfld() {
        frame = new JFrame("TextArea and PasswordField");
        frame.setLayout(new FlowLayout());

        textArea = new JTextArea(10, 30);
        textArea.setEditable(true);

        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*');

        frame.add(new JScrollPane(textArea));
        frame.add(passwordField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                textArea.append("Typed character: " + c + "\n");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new txtfld());
    }
}