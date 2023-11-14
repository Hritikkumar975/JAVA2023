package employee;

import employee.Emp;
 class Emppay {
   public static void main(String[] args) {
    Emp obj=new Emp();
    obj.getSal(101, "Uday", 10000, "management");
    obj.calulateSal();
    obj.printSalary();
   } 
}