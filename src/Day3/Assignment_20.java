package Day3;

import java.util.Scanner;

import java.lang.*;
public class Assignment_20 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        int len1,len2;
        System.out.print("Enter First String:");
        str1=sc.nextLine();
        System.out.print("Enter string to be compared:");
        str2 = sc.nextLine();
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
