package java;
public class inheritance7048_14 {
    static abstract class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog says Woof");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat says Meow");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Dog says Woof
        cat.makeSound(); // Cat says Meow
    }
}