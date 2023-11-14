class Main
{
  public static void main(String args[])
  {
     int arr[] = {12, 13, 91, 10, 34, 10};
     int max = arr[0];
     System.out.println("Given Array is :");
     for(int i=0;i<arr.length;i++)
     {
      
          System.out.print(arr[i]+" ");
     }
  
     for(int i=0; i<arr.length; i++)
     {
       if(max < arr[i])
       {
          max = arr[i];
       }
     }
     System.out.print("\nLargest number in Array is : "+ max); 
  }
}