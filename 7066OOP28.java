public class Rectangle{
    private double length;
    private double width;
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Getter method for length
    public double getLength() {
        return length;
    }
    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }
    // Getter method for width
    public double getWidth() {
        return width;
    }
    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }
    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
    public static void main(String[] args) {
        // Example usage
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Area: " + myRectangle.calculateArea());
        // Modify the length and width using setters
        myRectangle.setLength(7.0);
        myRectangle.setWidth(4.0);
        System.out.println("\nAfter modification:");
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Area: " + myRectangle.calculateArea());
    }
}
