package Exam1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class search_substring {
    public static void main(String args[]) {
        String input_str1 = new String("duplicate characters from a given string");
        StringTokenizer st = new StringTokenizer(input_str1, " ");
        String str[] = new String[20];
        int i = 0, j = 0;
        System.out.println("index "+input_str1.indexOf('i'));
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            //System.out.println(key);
            str[i] = key;
            i = i + 1;
        }
        int len = i;
        System.out.println("Enter string to search for");
        Scanner sc = new Scanner(System.in);
        String search_str;
        search_str = sc.next();
        int search_len = search_str.length();
        char array_char[] = new char[search_len];
        do {
            array_char[j] = search_str.charAt(j);
            j = j + 1;
        } while (j < search_len);
        System.out.println("Character array is: " + array_char.length);
        String new_str = "";
        for (i = 0; i < search_len; i++) {
            //System.out.println(array_char[i]);
            //System.out.println("replacing all " + array_char[i])
            new_str= input_str1.replace(array_char[i],' ');
            System.out.println(new_str);
            input_str1 = new_str;
        }
    }

}
