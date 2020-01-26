package Day4;

import java.util.Scanner;

//program to add all prime numbers between 1-100
public class Assignment_22 {

    public static void main(String[] arg) {
        System.out.print("Enter the lower bound (from 2 onwards) of the range of numbers:");
        Scanner sc = new Scanner(System.in);
        int lower_bound = sc.nextInt();
        System.out.print("Enter the Upper bound of the range of numbers:");
        int upper_bound = sc.nextInt();
        int sum_of_prime_num = 0;
        boolean is_prime;
        for (int i = lower_bound; i <= upper_bound; i++) {

                sum_of_prime_num = sum_of_prime_num + i;
        }
        System.out.println("Sum of prime number between " + lower_bound + " and " + upper_bound + " is :" + sum_of_prime_num);
    }

}

