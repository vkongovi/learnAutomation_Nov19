package Sorting;

import java.util.Scanner;

public class CreateElementsOfArray{
    public static void main(String[] arg){
    }

    public static int[] enterArrayValues(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements of the array:");
        int n=sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter value for element at position"+i+":");
            int elementValue=sc.nextInt();
            array[i]=elementValue;
        }
        return array;

    }
    //method to display array elements
    public static void displayArray(int[] a){
        System.out.println();
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            //add , only for element != last
            if(i!=a.length-1)
                System.out.print(a[i]+",");
            else
                System.out.print(a[i]);
        }
        System.out.print("]");
        System.out.println();
    }

}
