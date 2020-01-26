package Exam1;

import java.util.Scanner;

public class Question18 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String input_str = sc.nextLine();
        String[] words={};
        int begin_index=0, i = 0, previous_offset = 0;
        int length_of_str = input_str.length();
        length_of_str = length_of_str-1;
        System.out.println(length_of_str);
        //System.out.println(input_str.charAt((length_of_str-1)));
        while(i<=length_of_str)
        {
            //if counter is 0 or character at counter is space
            if (input_str.charAt(i)== ' ')
            {
                System.out.println("space at "+i);
                previous_offset=i;
               // System.out.println(input_str.substring(begin_index,i));
                i=i+1;
            }
            i=i+1;
        }
        System.out.println(input_str.substring(previous_offset));
        int len = length_of_str - previous_offset;
        System.out.println("Length of last word is "+len);

    }

}
