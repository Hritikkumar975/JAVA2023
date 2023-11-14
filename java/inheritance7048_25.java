package java;

// The abstract Bird class
abstract class Bird {
    // The abstract methods that need to be implemented by each subclass
    abstract void fly();
    abstract void makeSound();
}

// The Eagle subclass
class Eagle extends Bird {
    // Implementing the fly method to describe how Eagles fly
    public void fly() {
        System.out.println("Eagles can fly high.");
    }

    // Implementing the makeSound method to describe what sound Eagles make
    public void makeSound() {
        System.out.println("Eagles make a screeching sound.");
    }
}

// The Hawk subclass
class Hawk extends Bird {
    // Implementing the fly method to describe how Hawks fly
    public void fly() {
        System.out.println("Hawks can fly quickly.");
    }

    // Implementing the makeSound method to describe what sound Hawks make
    public void makeSound() {
        System.out.println("Hawks make a loud sound.");
    }
}

public class inheritance7048_25 {
    public static void main(String[] args) {
        // Creating objects of the Eagle and Hawk subclasses
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        // Calling the fly and makeSound methods for each object
        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();
    }
}