import java.util.ArrayList;
import java.util.List;

// Base class
class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return 0.05 * salary; // Default bonus calculation (5% of salary)
    }

    // Method to generate performance report
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ": Excellent");
    }
}

// Subclass Manager
class Manager extends Employee {
    private List<String> projects;

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
        projects = new ArrayList<>();
    }

    // Method to manage projects
    public void manageProjects(String projectName) {
        projects.add(projectName);
        System.out.println(getName() + " is managing the project: " + projectName);
    }

    // Override the bonus calculation method for Manager
    @Override
    public double calculateBonus() {
        return 0.1 * getSalary(); // Manager's bonus calculation (10% of salary)
    }
}

// Subclass Developer
class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Method to write code
    public void writeCode() {
        System.out.println(getName() + " is writing code.");
    }
}

// Subclass Programmer
class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    // Additional method for Programmer
    public void testCode() {
        System.out.println(getName() + " is testing code.");
    }
}

class Company {
    public static void main(String[] args) {
        // Example usage of the classes
        Manager manager = new Manager("John Doe", "123 Main St", 80000, "Manager");
        manager.manageProjects("Project A");

        Developer developer = new Developer("Alice Smith", "456 Oak St", 60000, "Developer");
        developer.writeCode();

        Programmer programmer = new Programmer("Bob Johnson", "789 Pine St", 70000, "Programmer");
        programmer.writeCode();
        programmer.testCode();

        // Calculate and display bonuses
        System.out.println("Bonus for " + manager.getName() + ": $" + manager.calculateBonus());
        System.out.println("Bonus for " + developer.getName() + ": $" + developer.calculateBonus());
        System.out.println("Bonus for " + programmer.getName() + ": $" + programmer.calculateBonus());

        // Generate performance reports
        manager.generatePerformanceReport();
        developer.generatePerformanceReport();
        programmer.generatePerformanceReport();
    }
}
