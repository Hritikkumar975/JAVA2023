import java.lang.*;
class F {  
      static int count(String x)  
        {  
          int count=0;  
            char ch[]= new char[x.length()];     
            for(int i=0;i<x.length();i++)  
            {  
                ch[i]= x.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
      public static void main(String[] args) {  
          String x ="Hello World";  
         System.out.println(count(x) + " words");   
    }  
}  