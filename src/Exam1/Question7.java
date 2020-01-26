package Exam1;
import java.io.*;

public class Question7 {
    public static void main(String[] arg){
        System.out.println("This is to perform Multiplication, subtraction and division using just + operator");
        int num1=14,num2=3;
        int i=0,j=0;
        byte b1=(byte) num1;
        byte b2 = (byte) num2;
        int product=0,difference_sub=0,quotient=0;
        //repetitive addition is multiplication so for loop for num2 times
        for(i=1;i<=num2;i++)
            product=product+num1;
        System.out.println("Multiplication of "+num1+" and "+num2+" is :"+product);
        //System.out.println("binary form is: "+b1);
        //System.out.println("binary form is: "+b2);
        //System.out.println(~num1);
        //System.out.println(num1 << num2);
        System.out.println("Subtraction of "+num1+" and "+num2+" is :"+subtract(num1,num2));
        //to check division using addition operation only
        int counter=0,remainder=0;
        int a=num1;int b=num2;
        while (a > b){
            a=a-b;//how many 3's in a four
            counter=counter+1;
        }
        remainder=a;
        System.out.println("Division of "+num1+" by "+num2+" is :"+counter+"  remainder is :"+remainder);
    }
    static int subtract(int a, int b){
        while (b !=0){
            int borrow=(~a) & b;
            a = a^b;
            b=borrow << 1;
        }
        int a1 = a;
        return a1;
    }
}
