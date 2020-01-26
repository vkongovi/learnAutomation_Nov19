package Day2;

import java.util.Scanner;
import java.lang.*;

public class Assignment_7 {
    public static void main(String[] agrs) {
        System.out.print("Enter a character:");
        Scanner sc = new Scanner(System.in);
        char input_char = sc.next().charAt(0);
        System.out.println("The ascii value of "+input_char+" is :"+(int) input_char);
    }
}
