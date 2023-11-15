

public class Emppay {
    public static void main(String[] args) {
        // Create an object of Emp class
        Emp e = new Emp("John Doe", 101, "Manager", 50000, 10000, 8000);

        // Calculate net pay
        e.calculateNetPay();

        // Display employee details
        e.displayDetails();
    }
}
