package Day2;

import java.util.Scanner;
import java.lang.*;

public class Assignment_13 {
    public static void main(String[] arg){
        String input_str,lower_case_str="";
        System.out.print("Enter a String to be converted to lower case: ");
        Scanner sc = new Scanner(System.in);
        input_str = sc.nextLine();
        System.out.println("The lower case of the entered string is " + input_str.toLowerCase());
    }
}
