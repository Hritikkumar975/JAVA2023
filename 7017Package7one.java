package employee;

class Emp {
    String name;
    double empid;
    String category;

    double bpay, hra, da, npay, pf, grossPay, incomeTax, allowance;

    public void getSal(int id, String n, double salary, String cate) {
        empid = id;
        name = n;
        bpay = salary;
        category = cate;
    }

    public void calulateSal() {
        // hra and da calculate
        if (bpay <= 10000) {
            hra = bpay * 0.2f;
            da = bpay * 0.8f;
        } else if (bpay <= 20000) {
            hra = bpay * 0.25f;
            da = bpay * 0.9f;
        } else {
            hra = bpay * 0.3f;
            da = bpay * 0.95f;
        }
        // gross pay cal
        grossPay = bpay + hra + da;

        // pf
        pf = (bpay + da) * 12 / 100;
        // income tax and allowance calculate
        if (bpay > 50000) {
            incomeTax = bpay * 0.1;
            allowance = bpay * 0.15;
        } else if (bpay > 30000) {
            incomeTax = bpay * 0.05;
            allowance = bpay * 0.1;
        } else if (bpay > 15000) {
            incomeTax = 0;
            allowance = bpay * 0.5;
        } else {
            incomeTax = 0;
            allowance = 0;
        }

        // net pay calculate
        npay = grossPay - pf - incomeTax;
    }

    public void printSalary() {
        System.out.println("Salary Printing");
        System.out.println("EmpId = " + empid);
        System.out.println("Emp Name = " + name);
        System.out.println("Basic Pay = " + bpay);
        System.out.print("Hra = ");System.out.printf("%.2f \n",hra);
        System.out.print("Da = ");System.out.printf("%.2f \n",da);
        System.out.print("Npay = ");System.out.printf("%.2f \n",npay);
        System.out.print("Pf = ");System.out.printf("%.2f \n",pf);
        System.out.print("GrossPay = ");System.out.printf("%.2f \n",grossPay);
        System.out.print("Allowance = ");System.out.printf("%.2f \n",allowance);

 
    }
    public static void main(String[] args) {
        
    }
}