package Hackathon;

import static Hackathon.Question_3.numberArraytoString;
import static Hackathon.Question_3.palindromeCheck;

public class Question_10 {
    public static void main(String[] arg){
        String sb= new String();
        String s="MALAYALAM";
        int[] a=new int[s.length()];
        int i =0,j=0,str_len=s.length(),int_val=0;
        boolean flag=true,flag2=true;
        //call to palindrom check function in Question3
        flag=palindromeCheck(s);
        if (flag)
            System.out.println("The given String :"+s+" is a Palindrome");
        else
            System.out.println("The given String :"+s+" is NOT a Palindrome");
        //loop to create an integer array for every character of the string
       //System.out.println(str_len+" is the length of the given string");
        for(int temp=0;temp<str_len;temp++){
            int_val=(int) s.charAt(temp);
            a[temp]=int_val;
        }

            //call the method to return a string of the number array - Question3
        sb=numberArraytoString(a);
        System.out.println("The give string when converted to number and back to numbers as string is:");
        System.out.println(sb);
        //call question3 palindromecheck method
        flag2=palindromeCheck(sb);
        if (flag)
            System.out.println("The given String's number :"+s+" is a Palindrome");
        else
            System.out.println("The given String's number :"+s+" is NOT a Palindrome");
    }
}

