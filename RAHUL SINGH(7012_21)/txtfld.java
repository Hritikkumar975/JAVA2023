import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class txtfld {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Text Area and Password Field");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text area
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 300, 100);

        // Create a password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 150, 150, 30);

        // Create a button to display the text and password
        JButton displayButton = new JButton("Display");
        displayButton.setBounds(200, 150, 100, 30);

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textAreaText = textArea.getText();
                char[] passwordChars = passwordField.getPassword();
                String passwordText = new String(passwordChars);

                JOptionPane.showMessageDialog(frame,
                        "Text Area Content: " + textAreaText + "\nPassword Field Content: " + passwordText,
                        "Display",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(textArea);
        frame.add(passwordField);
        frame.add(displayButton);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
