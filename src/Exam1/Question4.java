package Exam1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] arg){
        System.out.print("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.print("Enter character to be removed:");
        char search_for = sc.next().charAt(0);
        char empty_char = 0;
        //String new_str = str1.
        System.out.println(str1.replace(search_for,empty_char));


    }
}

