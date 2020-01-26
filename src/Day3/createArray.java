package Day3;

import java.util.Scanner;

public class createArray {
    public int[] createArray(){
        System.out.println("Enter how mnay elements you want in this array");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int[] a = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter value for element at position "+i+" : ");
            a[i]=sc.nextInt();
        }
        return a;
    }

    public  int[] createArray(int n){
        int[] a= new int[n];
        for(int i=0;i<n;i++)
            a[i]=i;
        return a;
    }
    public static void main(String[] arg){
        System.out.print("Enter number of Elements :");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        createArray cs = new createArray();
        int array[] = cs.createArray(num);
        int array1[]=cs.createArray();
        System.out.println("Array created with just counter values:");
        for (int t:array)
            System.out.println(t);


        System.out.println("Array created with choice of  values:");
        for (int t:array1)
            System.out.println(t);
    }

}
