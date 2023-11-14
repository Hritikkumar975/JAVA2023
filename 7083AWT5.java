import java.awt.*;   

class Text_Field {  

    public static void main(String s[]) {  
  
  Frame f = new Frame("Text Field ");    
 
    TextField t1;    
  
    t1 = new TextField("Enter Text ");    
    t1.setBounds(50, 100, 200, 30);    

    f.add(t1);  
  
    f.setSize(500,500);    
    f.setLayout(null);    
    f.setVisible(true);    
}    
}    