class a
{  
      int wordcount(String string)  
        {  
          // variable to count the words in strings
        String[] words = string.split(" ");
        int count = words.length;
        // System.out.println("Number of words: " + count);
        return count;
    }

      public static void main(String[] a) 
      {   a obj=new a();
          String string ="Post Graduate Government College, Sector-11, Chandigarh"; 
          System.out.println("String : "+string);
          System.out.println(obj.wordcount(string) + " words.");   
    }  
}  
