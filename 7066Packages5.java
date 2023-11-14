// File: mypackage/ClassA.java
package mypackage;
class ClassA{
    void display() {
        System.out.println("This is ClassA");
    }
}
// File: mypackage/ClassB.java
package mypackage;
class ClassB {
    void display() {
        System.out.println("This is ClassB");
    }
}
// File: mypackage/ClassC.java
package mypackage;
class ClassC {
    void display() {
        System.out.println("This is ClassC");
    }
}
// File: Main.java
// This is your main program outside the package.
public class Main{
    public static void main(String[] args) {
        mypackage.ClassA objA = new mypackage.ClassA();
        mypackage.ClassB objB = new mypackage.ClassB();
        mypackage.ClassC objC = new mypackage.ClassC();
        objA.display();
        objB.display();
        objC.display();
    }
}
