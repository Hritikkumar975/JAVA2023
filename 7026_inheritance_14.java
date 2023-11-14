// Superclass
class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark Bark!");
    }

    void wagTail() {
        System.out.println("Tail is wagging!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow Meow!");
    }

    void scratch() {
        System.out.println("Cat is scratching!");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        // Example of dynamic method dispatch
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calls to makeSound will be dynamically dispatched
        animal1.makeSound(); // Output: Bark Bark!
        animal2.makeSound(); // Output: Meow Meow!

        // The following would result in a compilation error
        // animal1.wagTail(); // Error: The method wagTail() is undefined for the type Animal

        // You can use casting to call subclass-specific methods
        if (animal1 instanceof Dog) {
            ((Dog) animal1).wagTail(); // Output: Tail is wagging!
        }

        if (animal2 instanceof Cat) {
            ((Cat) animal2).scratch(); // Output: Cat is scratching!
        }
    }
}

