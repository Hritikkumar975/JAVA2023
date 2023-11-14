// Rectangle.java

// Declare the Rectangle class, which implements the Resizable interface
class Rectangle implements Resizable {
    // Declare private instance variables to store width and height
    private int width;
    private int height;

    // Constructor for initializing the width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement the "resizeWidth" method to resize the width
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Implement the "resizeHeight" method to resize the height
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Method to print the current width and height of the rectangle
    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
