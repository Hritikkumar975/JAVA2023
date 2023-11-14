
class DuplicateWord 
{    
    public static void main(String[] args) 
    {  
        System.out.println("\nProgram to find the duplicate words in a string\n");   
        String string = "Hello how are you and What are you doing";    
        int count;       
        string = string.toLowerCase();        
        String words[] = string.split(" ");    
        System.out.println("Orginal string  is : "+string);     
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;       
                    words[j] = "0";    
                }    
            }        
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
    }    
}    