class a
{
    public static void main(String[] x) 
    {
        int arr[] = {10,20,30,40,50};
        System.out.println("Original Array:");
        // print the array using foreach loop
        for (int i:arr) 
        {
            System.out.print(i+" ");
        }
        int temp=arr[arr.length-1]; //storing value of last element of an array
          for (int i=arr.length-1;i>0;i--)
          {
                arr[i] = arr[i-1];
          }
          
        arr[0]=temp;   //storing value of last element of an array at index 0       
        System.out.println("\nArray after left rotation:");
        for (int i:arr) 
        {
            System.out.print(i+" ");
        }       
}
                  
}