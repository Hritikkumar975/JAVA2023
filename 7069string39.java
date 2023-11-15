public class ReplaceSpace  
{  
    public static void main(String str[] ) {  
        String s = "This is replace the space program";  
        char ch = '-';  
          
        s = s.replace(' ', ch);  
          
        System.out.println("String after replacing spaces with given character: ");  
        System.out.println(s);  
    }  
}  