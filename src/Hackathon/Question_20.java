package Hackathon;
//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        char userChoice = 'y';
        do {
            System.out.print("Enter a number between 1-7:");

            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("The Day is Sunday");
                    break;
                case 2:
                    System.out.println("The Day is Monday");
                    break;
                case 3:
                    System.out.println("The Day is Tuesday");
                    break;
                case 4:
                    System.out.println("The Day is Wednesday");
                    break;
                case 5:
                    System.out.println("The Day is Thursday");
                    break;
                case 6:
                    System.out.println("The Day is Friday");
                    break;
                case 7:
                    System.out.println("The Day is Saturday");
                    break;
            }
            System.out.println("Do you want to continue ? (y/n) :");
            userChoice = sc.next().charAt(0);
            //System.out.println(userChoice);
        } while (userChoice == 'y' || userChoice == 'Y') ;
        }
}
