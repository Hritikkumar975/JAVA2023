class A{
    void display()
    {
        System.out.println("this is a superclass");
    }
}
class B extends A{  //method of overriding
    void display()
    {
         System.out.println("this is a subclass");

    }
    public static void main(String a[])
    {
        B obj = new B();
        obj.display();
    }
}