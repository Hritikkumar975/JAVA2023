 class prog1 {
    public static void main(String[] args) {
        // Example usage:
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;

        int smallestNumber = findSmallestNumber(num1, num2, num3);

        System.out.println("The smallest number is: " + smallestNumber);
    }

    // Method to find the smallest number among three numbers
    private static int findSmallestNumber(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }
}
