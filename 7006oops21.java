public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an instance of the Person class using the parameterized constructor
        Person person1 = new Person("John Doe", 30);

        // Call the displayInfo method to display the person's information
        person1.displayInfo();
    }
}
