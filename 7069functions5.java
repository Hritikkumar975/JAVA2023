import java.util.Scanner;

public class Investment {
    public static void main(String str[] ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(principal, annualInterestRate, years);
        System.out.println("Future Investment Value: $" + futureValue);

        scanner.close();
    }

    static double calculateFutureValue(double principal, double annualInterestRate, int years) {
        
        double ratePerPeriod = annualInterestRate / 100;
        double futureValue = principal * Math.pow(1 + ratePerPeriod, years);
        return futureValue;
    }
}
