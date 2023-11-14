// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Implement the Resizable interface in the Rectangle class
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement the resizeWidth method
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Implement the resizeHeight method
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Getters for width and height
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

// Main class to test the Rectangle class
class Main {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 20);

        // Print the initial width and height
        System.out.println("Initial Width: " + rectangle.getWidth());
        System.out.println("Initial Height: " + rectangle.getHeight());

        // Resize the width and height
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);

        // Print the updated width and height
        System.out.println("Updated Width: " + rectangle.getWidth());
        System.out.println("Updated Height: " + rectangle.getHeight());
    }
}
