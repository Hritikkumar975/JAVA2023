import java.util.Arrays;

class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {10, 2, 9, 1, 5, 6};
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Second largest no. in Array: " + arr[arr.length-2]);
    }
}