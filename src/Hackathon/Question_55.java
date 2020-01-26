package Hackathon;

import java.util.Scanner;

public class Question_55 {
    public static void main(String[] arg){
        //To display multiplication tables of a given number;
        System.out.print("Enter the number for which you want the tables:");
        Scanner sc = new Scanner(System.in);
        int nTables=sc.nextInt();
        System.out.print("Enter till what number do you want it:");
        int m=sc.nextInt();
        int i=1;
        for(i=1;i<=m;i++)
            System.out.println(i+" X "+nTables+" = "+nTables*i);

    }
}
