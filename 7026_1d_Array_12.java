public class ArraySum {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum
        int sum = calculateSum(numbers);

        // Print the result
        System.out.println("Sum of the array elements: " + sum);
    }

    private static int calculateSum(int[] array) {
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}
