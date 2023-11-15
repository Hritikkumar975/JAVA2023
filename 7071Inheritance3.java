// Rename the file for compilation

class Shape {

    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println("Shape area: " + shape.getArea());

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
