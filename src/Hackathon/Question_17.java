package Hackathon;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] arg) {
       // System.out.println("Enter q to quit:");
        System.out.println("Enter input: ");
        Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    int i = sc.nextInt();
                    System.out.println("It is an integer :" + i);
                }
                 else if (sc.hasNextBoolean()) {
                    boolean b = sc.hasNextBoolean();
                    System.out.println("It is a boolean:" + b);
                }
                 else if (sc.hasNext()) {
                    String s = sc.next();
                    System.out.println("It is a String :" + s);
                }
                 else
                    System.out.println("It is not a Integer,String or a boolean");

            }
        sc.close();
    }
    }

