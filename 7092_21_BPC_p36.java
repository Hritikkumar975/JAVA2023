import java.util.*;
import java.io.*;
public class p6{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of base : ");
        int b = obj.nextInt();
        System.out.println("Enter value of height : ");
        int h = obj.nextInt();
        System.out.println("Enter value of width : ");
        int w = obj.nextInt();
        int res =l*b*h;
        System.out.println("Volume of Cuboid : "+res);
    }
}
