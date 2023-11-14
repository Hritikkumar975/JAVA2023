// Superclass
class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method in the superclass
    @Override
    void makeSound() {
        System.out.println("Bark Bark!");
    }

    // New method specific to the Dog class
    void wagTail() {
        System.out.println("Tail is wagging!");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Example usage
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        // Using the makeSound method of the Animal class
        genericAnimal.makeSound(); // Output: Generic Animal Sound

        // Using the overridden makeSound method of the Dog class
        myDog.makeSound(); // Output: Bark Bark!

        // Using the wagTail method, specific to the Dog class
        myDog.wag
