package Hackathon;

import java.util.Scanner;
//Q58. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer
public class Question_58 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int digits_add=sumofdigits(num);
        System.out.println("Sum of the digits of :"+num+" is :"+digits_add);
    }

    public static int sumofdigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
        //System.out.println("ANswer is :" + sum);
    }
}
