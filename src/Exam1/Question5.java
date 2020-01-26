package Exam1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] arg){
        System.out.print("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        System.out.println(str1.length());
        int length = str1.length();
        char[] input_char = new char[length+2];
        int i=0;
        while(i<length){
           // System.out.println(str1.charAt(i));
           input_char[i]=str1.charAt(i);
            i=i+1;
        }
        i=0;
        for (i=0;i<=length;i++){
            int count=0;
            char pick=input_char[i];
            for (int j=0;j<=length;j++){
                if (input_char[j]==pick) {
                    // is_repeat = true;
                    count = count + 1;
                }
            }
            if (count==1)
                System.out.println(pick + " appears only once - unique");
            else
                System.out.println(pick + " occurs "+count +" times");
        }

    }
}
