// Data conversion:- 14. How to convert object to String.     By(7058/21)

class Chugh{}

class OTS {

  public static void main(String[] args){

  Chugh ar=new Chugh();

String str2 = String.valueOf(ar);
  
String str1 = ar.toString();
  
System.out.println("object value:-"+str2);
System.out.println("converted to string :-"+str1);
}
}
 