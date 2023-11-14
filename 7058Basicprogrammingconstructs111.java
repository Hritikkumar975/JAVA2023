// Basic Programing Construct:- 111. Write a Java program that reads a set of integers, and then prints the sum of the even and odd //integers using loop.     By(7058/21)

import java.util.Scanner;


 class Sum {

  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number of integers: ");

     int n = input.nextInt();

     int[] numbers = new int[n];

     int sumEven = 0, sumOdd = 0;

     System.out.print("Enter " + n + " integers: ");

     for (int i = 0; i < n; i++) {

        numbers[i] = input.nextInt();

     }

     

     // Calculate the sum of even and odd integers

     for (int i = 0; i < n; i++) {

        if (numbers[i] % 2 == 0) {

           sumEven += numbers[i];

        } else {

           sumOdd += numbers[i];

        }

     }

     

     // Print the results

     System.out.println("Sum of even integers: " + sumEven);

     System.out.println("Sum of odd integers: " + sumOdd);

  }

}