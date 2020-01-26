package Day2;

import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = a+a*a+a*a*a+a*a*a*a;
        System.out.print("The value of  x+xx+xxx+xxxx when x = "+a+" is "+total);
    }
}
