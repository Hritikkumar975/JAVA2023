import java.awt.*;
import java.awt.event.*;
 class a
 {  
    public static void main(String[] x)
    {
        
    Frame  f= new Frame("TextField with custom layout"); //create frame
    TextField t1 = new TextField("TextField with custom layout"); //create textfield
    t1.setBounds(50, 100, 200, 30); //set dimensions
    TextField t2 = new TextField();
    t2.setBounds(50, 150, 200, 30); 
    f.add(t1);                                        //add textfields into the frame
    f.add(t2);   
    // setting size, layout and visibility of frame   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true); 
    f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

   }
}
    

