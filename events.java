import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Add extends Frame implements ActionListener
{
    Add()
    {
        Button b1 = new Button();
        b1.setVisible(true);
        b1.setBounds(50,50,300,300);
        setSize(300,400);
        add(b1);
        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Hello");
    }
    public static void main(String arg[])
    {
        Add a1 = new Add();
    }

}