import java.io.*;
import java.util.Scanner;

public class readfile{
public static void main(String s[]){
int count=0; int word=0; int character=0;
try{
File f1= new File("InputOutputfile.txt");
Scanner s1= new Scanner(f1);
System.out.println("Data in the file is: ");
while(s1.hasNextLine()){
count++;
String str= s1.nextLine();
for(int i=0; i<str.length()-1;i++){
if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ') && (i>0)){
word++;}
if(str.charAt(i)!=' '){character++;}}
word++;
System.out.println(str);
}
System.out.println("\n\nNumber of lines : "+count);
System.out.println("Number of words : "+word);
System.out.println("Number of characters : "+character);
s1.close();
}catch(FileNotFoundException e){System.out.println(e);}
}}