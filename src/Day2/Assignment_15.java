package Day2;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] arg) {
        System.out.println("");
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        //Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int larger_number=0;
            larger_number = compare_number(a, b);
            System.out.println("Larger number is "+larger_number);
    }

     static int compare_number(int a, int b) {
        if (a > b)
            return a;
        else if (a == b)
            return 0;
        else if ((a % 6 == 0) && (b % 6 == 0))
            return b;
        else return b;
    }
}
