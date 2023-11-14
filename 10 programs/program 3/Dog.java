// Dog.java
// Class Dog

// Declare the Dog class, which implements the Animal interface
public class Dog implements Animal {
    // Implement the "bark" method required by the Animal interface
    @Override
    public void bark() {
        // Print a message indicating that the Dog is barking
        System.out.println("Dog is barking!");
    }
}
