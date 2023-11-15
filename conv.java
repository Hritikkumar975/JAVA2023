//p91 : Write a Java program to convert an array to ArrayList //

import java.util.ArrayList;
  import java.util.Arrays;
public class conv {
  public static void  main(String[] args) 
  {
  String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
  
  System.out.println(list);
  }
}
