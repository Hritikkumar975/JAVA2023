public class AverageCalculator {

    public static void main(String[] args) {
        // Example usage
        double num1 = 10.5;
        double num2 = 20.3;
        double num3 = 15.7;

        double average = calculateAverage(num1, num2, num3);

        System.out.println("The average is: " + average);
    }

    // Method to calculate the average of three numbers
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
