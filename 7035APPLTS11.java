import java.awt.*;
import  java.applet.*;
public class bgcolor extends Applet implements java.awt.event.ActionListener{
int count=0;
public void init(){
Button b1= new Button("click to change background color");
setLayout(null);
b1.setBounds(800,100,300,200);
b1.setFont(new Font("Arial",Font.PLAIN,18));
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(java.awt.event.ActionEvent ae){
count++;
if(count==1){
setBackground(Color.red);}
else if(count==2){
setBackground(Color.blue);}
else if(count==3){
setBackground(Color.green);}
else if(count==4){
setBackground(Color.cyan);}
else{
setBackground(Color.white);
count=0;}}
}
/* <applet code="bgcolor.class" width="250" height="100"></applet>*/