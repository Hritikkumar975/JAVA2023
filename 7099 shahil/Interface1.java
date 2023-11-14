 interface Shape {
  double getArea();
}

 class Rectangle implements Shape {
  private double length;
  private double width;

   Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  
  public double getArea() {
    return length * width;
  }
}

 class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  
  public double getArea() {
    // Calculate and return the area of the circle using the formula: π * r^2.
    return Math.PI * radius * radius;
  }
}

class Triangle implements Shape {
  
  private double base;
  private double height;


  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getArea() {

    return 0.5 * base * height;
  }
}

public class Interface1 {
  public static void main(String[] args) {
    
    Rectangle rectangle = new Rectangle(10, 12);
    Circle circle = new Circle(3);

    
    Triangle triangle = new Triangle(4, 6);

    
    System.out.println("Area of the Rectangle: " + rectangle.getArea());

    
    System.out.println("Area of the Circle: " + circle.getArea());
System.out.println("Area of the Triangle: " + triangle.getArea());
  }
}

