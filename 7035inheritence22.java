abstract class vehicle{
abstract void startEngine();
abstract void stopEngine();
}
class car extends vehicle{
void startEngine(){System.out.println("Car Engine starts");}
void stopEngine(){System.out.println("Car Engine stops");}
public static void main(String s[]){
car obj= new car();
obj.startEngine();
obj.stopEngine();
}}
class motorcycle extends vehicle{
void startEngine(){System.out.println("Motorcycle Engine starts");}
void stopEngine(){System.out.println("Motorcycle Engine stops");}
public static void main(String s[]){
motorcycle obj1= new motorcycle ();
obj1.startEngine();
obj1.stopEngine();
}}