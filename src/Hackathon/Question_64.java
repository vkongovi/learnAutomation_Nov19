package Hackathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Write a Java program to replace the second element of a ArrayList with the specified element.
public class Question_64 {
    public static void main(String[] arg){
        List<Integer> arrayList = new ArrayList<Integer>();
        int[] array1 = {34,78,45,1,98,23,56,12,4};
        int k=array1.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to be replace the 2 nd element of the array List:");
        int elementTocheck=sc.nextInt();

        for(int i=0;i<k;i++){
            arrayList.add(array1[i]);
        }

        System.out.println("Elements before:");
        System.out.println(arrayList);
        //replace the 2 nd element of the arrayList with value
        arrayList.set(1,elementTocheck);
        System.out.println("Elements are replacing");
        System.out.println(arrayList);
    }
}
