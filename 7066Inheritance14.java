class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal animal = new Animal();
        Animal dog = new Dog(); // Upcasting
        Animal cat = new Cat(); // Upcasting
        // Calling makeSound() method
        animal.makeSound(); // Output: Some generic sound
        dog.makeSound();    // Output: Bark! Bark!
        cat.makeSound();    // Output: Meow! Meow!
    }
}
