 //Program no. : 4
 //Program name : Create a simple AWT application that displays a TextField with FlowLayout manager.
 class awt {
    public static void main(String[] args) {
        java.awt.Frame f = new java.awt.Frame("Textfield");

        java.awt.TextField t = new java.awt.TextField("Enter your name ");

        f.add(t);
        f.setSize(400, 200);
        f.setLayout(new java.awt.FlowLayout());
        f.setVisible(true);
        
    }
    
}
