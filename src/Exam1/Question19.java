package Exam1;

import java.util.Scanner;

public class Question19 {
    public static void main(String arg[]) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++)
            System.out.println("Number is: "+i+" and Cube of "+i+" is :"+i*i*i);
    }
}
