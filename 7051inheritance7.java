import java.util.Scanner;


class Person {
    private String firstName;
    private String lastName;

  
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter employee's last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter employee's ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter employee's job title: ");
        String jobTitle = scanner.nextLine();

        Employee employee = new Employee(firstName, lastName, employeeId, jobTitle);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Job Title: " + employee.getLastName());

        scanner.close();
    }
}