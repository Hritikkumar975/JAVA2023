

class awt{
    public static void main(String[] args) {
        java.awt.Frame f = new java.awt.Frame("Button");
        java.awt.Button b = new java.awt.Button("Submit");

        f.add(b);

        f.setSize(400, 200);
        f.setLayout(new java.awt.FlowLayout());
        f.setVisible(true);
        
    }
}