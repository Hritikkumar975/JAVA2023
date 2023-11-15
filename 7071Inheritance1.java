// rename the file as animal for compilation
class Animal {

    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}