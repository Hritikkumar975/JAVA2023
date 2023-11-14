import java.util.*;
import java.io.*;
public class p8{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of base : ");
        int b = obj.nextInt();
        System.out.println("Enter value of height : ");
        int h = obj.nextInt();
        System.out.println("Enter value of width : ");
        int w = obj.nextInt();
        int res = 2 * ((l * h) + (w * h) + (l * w));
        System.out.println("Surface area of Cuboid : "+res);
    }
}
