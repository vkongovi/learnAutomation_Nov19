package Day4;

import java.util.Scanner;

public class Assignment_23 {
    public static void main(String[] arg) {
        System.out.print("Enter String :");
        Scanner sc = new Scanner(System.in);
        String input_str = sc.nextLine();
        int length = input_str.length();
        length = Math.round(length)/2;
        System.out.println(length);
        System.out.println(input_str.substring(0,length));
    }
}
