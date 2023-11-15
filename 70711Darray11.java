//rename the file

public class CountElements {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Display the original array
        System.out.println("Original Array:");
        displayArray(array);

        // Print the number of elements in the array
        int numberOfElements = countElements(array);
        System.out.println("Number of elements in the array: " + numberOfElements);
    }

    // Method to count the number of elements in an array
    private static int countElements(int[] arr) {
        return arr.length;
    }

    // Method to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

