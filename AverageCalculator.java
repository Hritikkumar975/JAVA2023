 public class AverageCalculator {
    public static void main(String[] args) {
        // Example usage
        double num1 = 10.5;
        double num2 = 20.3;
        double num3 = 15.8;

        double average = calculateAverage(num1, num2, num3);

        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
    }

    // Method to calculate the average of three numbers
    private static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
 
