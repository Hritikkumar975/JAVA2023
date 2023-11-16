import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        // Create an object of Emp class
        Emp e = new Emp();

        // Assign values to employee attributes
        e.name = "John Doe";
        e.empid = 1001;
        e.category = "Manager";
        e.bpay = 50000;

        // Call the method to calculate values
        e.calculateValues();

        // Print employee payroll information
        System.out.println("Employee Name: " + e.name);
        System.out.println("Employee ID: " + e.empid);
        System.out.println("Category: " + e.category);
        System.out.println("Basic Pay: " + e.bpay);
        System.out.println("Net Pay: " + e.npay);
        System.out.println("Gross Pay: " + e.grosspay);
        System.out.println("Income Tax: " + e.incometax);
        System.out.println("Allowance: " + e.allowance);
    }
}
