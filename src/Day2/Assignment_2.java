package Day2;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String arg[]){
        System.out.println("test");
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        //Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Addition of "+a+" and "+b+" is :"+(a+b));
        System.out.println("Subtraction of "+a+" and "+b+" is :"+(a-b));
        System.out.println("Multiplication of "+a+" and "+b+" is :"+(a*b));
        System.out.println("Division of "+a+" by "+b+" is :"+(a/b));
        System.out.println("Remainder of "+a+" divided by "+b+" is :"+(a%b));



    }
}
