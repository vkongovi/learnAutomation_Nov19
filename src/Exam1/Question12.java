package Exam1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] arg){
        System.out.println("Enter four number");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        if (num1==num2 && num2==num3 && num3==num4)
            System.out.println("All are Equal");
        System.out.println("Numbers are not equal!");



    }
}
