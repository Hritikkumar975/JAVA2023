 class Multi_catch {  
  
    public static void main(String x[] ) {  
          
           try{    
                int a=10/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception ");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception ");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception ");  
                  }             
              
    }  
}  