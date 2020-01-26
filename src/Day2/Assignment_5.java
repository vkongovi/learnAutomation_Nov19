package Day2;

import java.util.Scanner;
import java.lang.*;
public class Assignment_5 {
    public static void main(String agrs[]) {
        System.out.print("Enter value for radius of a circle:");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pi = 3.14;
        System.out.println("Area of the circle is:" + (pi * radius * radius) + " sq units");
        System.out.println("Circumference  of the circle is:" + (2 * pi * radius) + " sq units");
    }

}
