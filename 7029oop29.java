 class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

   
    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int id) {
        employee_id = id;
    }

  
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String name) {
        employee_name = name;
    }

    public String getFormattedEmployeeSalary() {
        return String.format("%.2f", employee_salary);
    }

   
    public void setEmployeeSalary(double salary) {
        employee_salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Ayush");
        employee.setEmployeeSalary(50000.0);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: $" + employee.getFormattedEmployeeSalary());
    }
}
