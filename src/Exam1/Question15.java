package Exam1;

import java.util.Scanner;

public class Question15 {
    public static void main(String args[]) {
    String givenString="duplicate characters from a given string";
    String searchString="given";
    String new_str="";
    int l1=givenString.length();
    int l2=searchString.length();
        System.out.println(l1+ "---------"+l2);
    for(int i=0;i<l2;i++){
        char c=searchString.charAt(i);
        for(int j=0;j<l1;j++){
                givenString.replace(c, '#');
            }
        }
        System.out.println();
        System.out.println(new_str);
        for(int j=0;j<l1;j++){
            if (new_str.charAt(j)!='#')
                new_str=new_str+new_str.charAt(j);
        }
        System.out.println(new_str);
    }
}