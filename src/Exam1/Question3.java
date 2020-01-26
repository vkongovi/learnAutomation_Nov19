package Exam1;

import java.util.Scanner;

public class Question3 {
    public static void main(String agrs[]) {
        System.out.print("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String rev_str1="";
        int len = str1.length();
        for (int i = (len-1);i>=0;i--)
        {
            rev_str1= rev_str1 + (str1.charAt(i));

        }
        System.out.print("Reverse is:"+rev_str1);


    }
}
