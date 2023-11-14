import java.awt.*;    
  
class a  
{    
    a() 
    {    
                             // creating the frame  
        Frame f = new Frame();   
                          // creating the list of 5 rows   
        List l1 = new List(5);     
                          // adding list items into the list  
        l1.add("C");    
        l1.add("C++");    
        l1.add("DS");    
        l1.add("DBMS");    
        l1.add("JAVA");    
  
        f.add(l1);   
        List l2 = new List(4);     
                          // adding list items into the list  
        l2.add("HTML");  
        l2.add("CSS");   
        l2.add("JAVA SCRIPTS");    
        l2.add("PHP");    
        // l2.add("")

        f.add(l2);
  
        // setting size, layout and visibility of frame  
        f.setSize(400, 400);    
        f.setLayout(new FlowLayout());    
        f.setVisible(true);    
     }    
  
      // main method  
      public static void main(String args[])    
      {    
         new a();    
      }    
}    