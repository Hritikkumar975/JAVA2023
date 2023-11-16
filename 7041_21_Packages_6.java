 MyPackage/Class1.java
package MyPackage;

public class Class1 {
    public void function1() {
        System.out.println("Function 1 from Class1");
    }
}

 MyPackage/Class2.java
package MyPackage;

public class Class2 {
    public void function2() {
        System.out.println("Function 2 from Class2");
    }
}

 MyPackage/Class3.java
package MyPackage;

public class Class3 {
    public void function3() {
        System.out.println("Function 3 from Class3");
    }
}

MyPackage/Class4.java
package MyPackage;

public class Class4 {
    public void function4() {
        System.out.println("Function 4 from Class4");
    }
}
/MainApp.java
import MyPackage.Class1;
import MyPackage.Class2;
import MyPackage.Class3;
import MyPackage.Class4;

class Packages_6 {
    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();
        Class3 obj3 = new Class3();
        Class4 obj4 = new Class4();

        obj1.function1();
        obj2.function2();
        obj3.function3();
        obj4.function4();
    }
}