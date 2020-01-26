package Hackathon;

import java.util.Scanner;

//kaprekar number
//9*9=81 => sum of the digits 8+1 --invoke question 58 -sum of digits
public class Question_63 {
    public static void main(String[] arg){
       // Scanner sc=new Scanner(System.in);
        //System.out.print("Enter a number :");
       // int num = sc.nextInt();
        boolean flag=false;
        //call to kaprekar method
        for(int j=0;j<1000;j++) {
            flag = isKaprekar(j);
            if (flag)
                System.out.println( j +" ==> is a Kaprekar's Number");
        }
    }

    public static boolean isKaprekar(int n){
        if (n==1) {
              return true;
        }

        int sqr_n=n*n;
        int count=0;
        while(sqr_n!=0){
            count++;
            sqr_n=sqr_n/10;
        }
        sqr_n=n*n;
        for(int i=1;i<count;i++){
            int eq_parts= (int) Math.pow(10,i); //unboxing??
            if (eq_parts==n)
                continue;
            int sum=sqr_n/eq_parts+sqr_n%eq_parts;
            if (sum==n)
                return true;
        }
        return false;
    }
}
