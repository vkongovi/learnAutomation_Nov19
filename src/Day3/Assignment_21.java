package Day3;

import java.util.Scanner;

import java.lang.*;
public class Assignment_21 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.print("Enter  String:");
        str1 = sc.nextLine();
        char replace_char,search_char;
        System.out.print("Enter character to be searched for:");
        search_char=sc.next().charAt(0);
        System.out.print("Enter character to be replaced with:");
        replace_char=sc.next().charAt(0);
        System.out.println(str1.replace(search_char,replace_char));
    }
}
