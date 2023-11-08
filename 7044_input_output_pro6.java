
//Program no. : input /output 6
//Program name : Enter the boolean from user using Scanner class

import java.util.Scanner;

class getBoolean {
    public static void main(String[] args) {

        System.out.print("Enter boolean value , true or false : ");
        Scanner input = new Scanner(System.in);

        try {
            boolean b = input.nextBoolean();
            System.out.println(b);
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Wrong input , You have to type boolean value e.g true or false ");

        }

    }
}