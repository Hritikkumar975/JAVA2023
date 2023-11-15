// Program no. : inheritance 3
// Program name :  Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle

class Shape{
    public double getArea(double length  , double breadth){
        return length *breadth;
    
    
    
    }
}
class Rectangle  extends Shape{
    public double getArea(double length , double breadth){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        double result = obj.getArea(5.5, 10);

        System.out.println("Area of Rectangle is : " +result );
    }
}