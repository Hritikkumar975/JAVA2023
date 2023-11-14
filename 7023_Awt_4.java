import java.awt.*;   
class A{  
    
    public static void main(String a[]) {    
    
    Frame f = new Frame("Nihkil 7023");    
  
    
    TextField t1, t2;    
    
    t1 = new TextField("java Practical");    
    
    t2 = new TextField("AWT textfield");    
     
   
    f.add(t1);  
    f.add(t2);   
    
    f.setSize(400,400);    
    f.setLayout(new FlowLayout());    
    f.setVisible(true);    
}    
}    