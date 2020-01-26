package Day2;

import java.util.*;
public class Assignment_3 {
    public static void main(String[] args){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter another number:");
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a+" > "+b);
        else if (b > a)
            System.out.println(a+" < "+b);
        else if (a==b)
            System.out.println(a+" = "+b);


    }
}
