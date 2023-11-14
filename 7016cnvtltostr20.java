
public class cnvtltostr {   
      
    // main method   
    public static void main(String args[])   
    {   
      
        // create a Long   
        Long varLong = 999999999999L;   
      
        // convert into String  
        String str = varLong+" ";  
        
        // printing the type of str to 
        // show that long has been converted to string 
        System.out.println("Converted type : "+str.getClass().getName()); 
      
        // print Long as String   
        System.out.println(str);   
    }   
}