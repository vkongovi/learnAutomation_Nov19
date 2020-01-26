package Day2;
//Question:.Program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
//   Sample Output:
//
//   Input the first number : 35
//   Input the second number: 45
//   Result: true

import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] arg){
        //Approach check ascii values of the digits?
        //variable declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers between 25 - 75:");
        System.out.print("Input first number:");
        String inputNumberString1 = sc.next();
        System.out.print("Input second number:");
        String inputNumberString2 = sc.next();
        int len1 = inputNumberString1.length();
        int len2 = inputNumberString2.length();
        int j=0;
        boolean result=false;
        //program logic
        while (j<len2) {
            char digit1 = inputNumberString1.charAt(j);
            //System.out.println("value is :"+digit1);
            for (int i = 0; i < len1; i++) {
                char digit2 = inputNumberString2.charAt(i);
               // System.out.println("value is :"+digit2);
                if (digit1==digit2) {
                    result = true;
                    break;
                }
            }
            j=j+1;
        }
        System.out.println("Result :"+result);
        //formatted o/p

    }
}

