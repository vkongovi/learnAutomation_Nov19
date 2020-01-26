package Day3;

import java.util.Scanner;

import static java.lang.Math.floor;

public class Assignment_18 {
    public static void main(String arg[]) {
        System.out.println("test");
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter another number:");
        int num2 = sc.nextInt();
        //System.out.println((a/b));
        int remainder = num1 - ((num1/num2)*num2);
        System.out.println("Output is: "+remainder);
    }
}
