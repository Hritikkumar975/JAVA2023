// Rename the file as vehicle to run it

class Vehicle {

    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {

    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }
}