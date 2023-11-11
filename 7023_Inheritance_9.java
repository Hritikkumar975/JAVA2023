class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }

    public double calculateDistanceTraveled(double time, double speed) {
        return time * speed;
    }

    public double calculateMaxSpeed(double power, double weight) {
        return power / weight;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("TATA", "F150", 2020, "Diesel");
        Car car = new Car("Toyota", "Camry", 2019, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500", 2021, "Petrol");

        System.out.println("Truck fuel efficiency: " + truck.calculateFuelEfficiency(100, 10));
        System.out.println("Car distance traveled: " + car.calculateDistanceTraveled(2, 60));
        System.out.println("Motorcycle max speed: " + motorcycle.calculateMaxSpeed(50, 300));
    }
}