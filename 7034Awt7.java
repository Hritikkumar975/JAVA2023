//Create a simple AWT application that displays a Checkbox with Custom Layout.

import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
class myframe extends Frame{
    private Checkbox b1;
    myframe(){
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        b1 = new Checkbox("Check 1");
        b1.setBounds(100,100,50,30);
        add(b1);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
}

    public static void main(String arg[])
    {
        new myframe();
    }
}