package Hackathon;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] arg){
        System.out.print("Enter a number to find it's factorial:");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int fact=1,fun_fact=1,i=1;
        //without recursive function
        while(i<=number && i!=0){
            fact=fact*i;
            i=i+1;
        }
        System.out.println(number+"! is :"+fact);
        fun_fact=factorial(number);
        System.out.println();
        System.out.println("Factorial of "+number+" from recursive function is :"+fun_fact);
    }

    //a funtion to calculate factorial
    public static int factorial(int n){
        int f=n;
        if (f!=0)
            f=f*factorial(f-1);
        else
            f=1;
        return f;


    }
}
