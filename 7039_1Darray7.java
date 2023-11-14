import java.util.Scanner;
class a {
    public static void main(String[] x) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the element at index : "+i);
            arr[i] = s.nextInt();
        }
        // Printing the entered array
        System.out.println("Elements of an array present on even position : ");

      for(int i=0;i<arr.length;i++)
      {
        if(i%2==0)
        {
            System.out.println(arr[i]);
        }

    }
    }
}
