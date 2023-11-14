class method121 {

    void disp() {
        // initializing numbers to compare
        int a = 19, b = 23, c = 14;
        // comparing numbers, a with b and a with c
        // if both conditions are true, prints a
        if (a <= b && a <= c)
            System.out.println(a + " is the smallest number");
        // comparing b with a and b with c
        // if both conditions are true, prints b
        else if (b <= a && b <= c)
            System.out.println(b + " is the smallest number");
        else
            // prints c if the above conditions are false
            System.out.println(c + " is the smallest number");
    }

    public static void main(String[] args) {
        method121 obj = new method121();
        obj.disp();
    }
}