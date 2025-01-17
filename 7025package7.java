package employee;

class Emp {
    String name, empid, category;
    int bpay;
    double hra, da, npay, pf, grosspay, incometax, allowance;

    public Emp(String n, String id, String c, int b) {
        name = n;
        empid = id;
        category = c;
        bpay = b;
    }

    public void call() {
        da = bpay * 0.05;
        hra = bpay * 0.09;
        pf = bpay * 0.11;
        allowance = bpay * 0.10;
        grosspay = bpay + da + hra + allowance - pf;
        incometax = 0.75 * grosspay;
        npay = grosspay - incometax;
    }

    public void display() {
        System.out.println("\n\nEmployee Details");
        System.out.println("\nName: " + name);
        System.out.println("\nEmpid: " + empid);
        System.out.println("\nCategory: " + category);
        System.out.println("\nbpay: " + bpay);
        System.out.println("\nda: " + da);
        System.out.println("\nhra: " + hra);
        System.out.println("\npf: " + pf);
        System.out.println("\nall: " + allowance);
        System.out.println("\ngs: " + grosspay);
        System.out.println("\nIncometax: " + incometax);
        System.out.println("\nnpay: " + npay);
    }
}
