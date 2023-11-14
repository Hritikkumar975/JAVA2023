public class ConsecutiveCheck {
    public static void main(String[] args) {
        // Example usage
        int num1 = 5;
        int num2 = 6;
        int num3 = 7;

        boolean result = areConsecutive(num1, num2, num3);

        System.out.println("Are the numbers consecutive? " + result);
    }

    // Method to check if three integers are consecutive
    private static boolean areConsecutive(int num1, int num2, int num3) {
        // Check if the difference between consecutive numbers is 1
        return (num2 == num1 + 1 && num3 == num2 + 1);
    }
}
