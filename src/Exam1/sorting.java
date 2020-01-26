package Exam1;

import java.util.Scanner;

public class sorting {
    public static void main(String[] arg){
        //System.out.print("Enter a String:");
        //Scanner sc = new Scanner(System.in);
        //String str1=sc.next();
        //int input_array1[]= new int[10];
        int input_array1[] = {1,3,4,7,2,8,9,3,9};
        int length = input_array1.length;
        int temp=0;
        System.out.println("Length is:"+length);
        length=length-1;
       for (int i=0;i<=length;i++){
           for (int j = i+1;j<=length;j++){
               if (input_array1[i] > input_array1[j]){
                   temp = input_array1[i];
                   input_array1[i] = input_array1[j];
                   input_array1[j] = temp;
               }
           }

       }
       for (int i=0;i<=length;i++)
           System.out.print(input_array1[i]+"\t");

       System.out.println();
       boolean repeat = true;
       for (int i=0 ;i<=length;i++){
           int current_value = input_array1[i];
           int count=1;
           if (current_value == input_array1[i + 1]) {
               count = count + 1;
               System.out.println(current_value+ " occurs "+count+" times");
               i=i+1;
           }
           System.out.println(current_value+ " occurs "+count+" times");
           i=i+1;

       }
    }
}
