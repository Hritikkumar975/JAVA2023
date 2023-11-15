

public class Emp {
    // Declare variables
    String name;
    int empid;
    String category;
    double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

    // Parameterized constructor
    public Emp(String name, int empid, String category, double bpay, double hra, double da) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
        this.hra = hra;
        this.da = da;
    }

    // Calculate net pay
    public void calculateNetPay() {
        grosspay = bpay + hra + da;
        pf = 0.12 * grosspay;
        allowance = 0.10 * grosspay;
        incometax = 0.05 * grosspay;
        npay = grosspay - (pf + incometax);
    }

    // Display details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("PF: " + pf);
        System.out.println("Allowance: " + allowance);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Net Pay: " + npay);
    }
}
