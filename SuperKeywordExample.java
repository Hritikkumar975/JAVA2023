// Create a program, showing an example of super keyword in inheritance concept
class Vehicle {
    int maxSpeed;

    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int numWheels;

    Car(int maxSpeed, int numWheels) {
        super(maxSpeed); // Call superclass constructor
        this.numWheels = numWheels;
    }

    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Number of Wheels: " + numWheels);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Car myCar = new Car(200, 4);
        myCar.displayInfo();
    }
}
