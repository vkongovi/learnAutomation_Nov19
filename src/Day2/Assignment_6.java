package Day2;

import java.util.Scanner;

public class Assignment_6 {
    public static void main(String agrs[]) {
        System.out.print("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String rev_str;
        rev_str=reverseString(str1);
        System.out.println("Reverse of the given String is ::"+rev_str);
    }//end of main

    //method to accept a string and reverse it
    public static String reverseString(String str){
        String rev_str="";
        int len = str.length();
        for (int i = (len-1);i>=0;i--)
            rev_str= rev_str + (str.charAt(i));

        return rev_str;
    }
}//end of class
