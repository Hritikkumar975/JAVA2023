import java.io.*;
class UserInput{
    public static void main(String st[]){
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        try{
        String name = r.readLine();
            System.out.print("You are "+name);
        }
        catch(IOException e){

        }
    }
}