package Day2;

import java.util.Scanner;
import java.lang.*;
public class Assignment_4 {
    public static void main(String agrs[]){
        System.out.print("Enter value for length of a rectangle:");
        Scanner sc = new Scanner(System.in);
        Float length = sc.nextFloat();
        System.out.print("Enter value for breadth of a rectangle:");
        Float breadth = sc.nextFloat();
        System.out.println("Area of the rectangle is:"+(length*breadth)+" sq units");
        System.out.println("Perimeter of the rectangle is:"+2*(length + breadth)+" units");
        System.out.println("Diagonal of the rectangle is:"+Math.sqrt((length*length) + (breadth*breadth))+" units");






    }
}
