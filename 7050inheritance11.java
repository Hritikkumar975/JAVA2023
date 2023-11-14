class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    public void animalSound(){
        super.animalSound();
        System.out.println("the dog says:bow wow");
    } 
}
  class Test{
    public static void main(String args[]){
        Animal myDog=new Dog();
        myDog.animalSound();
    }
}