//Program no. : oop 9
//Program name : Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.


import java.time.LocalDate;
import java.time.Period;

class Employee {
    String name;
    double salary;
    LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jimmy ", 150000, LocalDate.of(2020, 3, 25));

        System.out.println("Employee name : " + employee.getName() + "\nSalary : " + employee.getSalary()
                + "\nHire date : " + employee.getHireDate());
        int yearsOfService = employee.calculateYearsOfService();
        System.out.println("\n\nYears of Service: " + yearsOfService);
    }
}
