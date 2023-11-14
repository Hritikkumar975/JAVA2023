class smallestelement{
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 3, 8, 1, 7};

        // Find the smallest element in the array
        int smallest = numbers[0]; // Assume the first element is the smallest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the smallest element
        System.out.println("Smallest element in the array: " + smallest);
    }
}
