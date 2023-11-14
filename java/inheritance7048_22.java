//package java;

// Define the abstract class Person
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Declare the abstract methods
    abstract void eat();
    abstract void exercise();
}

// Define the Athlete subclass
class Athlete extends Person {
    Athlete(String name, int age) {
        super(name, age);
    }

    // Implement the eat method
    void eat() {
        System.out.println(name + " eats a balanced diet.");
    }

    // Implement the exercise method
    void exercise() {
        System.out.println(name + " engages in rigorous workouts.");
    }
}

// Define the LazyPerson subclass
class LazyPerson extends Person {
    LazyPerson(String name, int age) {
        super(name, age);
    }

    // Implement the eat method
    void eat() {
        System.out.println(name + " eats junk food.");
    }

    // Implement the exercise method
    void exercise() {
        System.out.println(name + " never exercises.");
    }
}

// Main class to test the code
public class inheritance7048_22 {
    public static void main(String[] args) {
        Person person1 = new Athlete("John", 25);
        Person person2 = new LazyPerson("Jane", 22);

        person1.eat();
        person1.exercise();

        person2.eat();
        person2.exercise();
    }
}