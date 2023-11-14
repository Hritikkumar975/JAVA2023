import java.util.Scanner;

class Rectangle {
    
    double width;
    double height;

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }
}


public class RectangleTest {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        myRectangle.width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        myRectangle.height = scanner.nextDouble();

        double area = myRectangle.calculateArea();
        double perimeter = myRectangle.calculatePerimeter();

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}
