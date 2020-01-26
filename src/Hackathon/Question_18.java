package Hackathon;
//merge sort
//using recursion - So same for Q22 also

import java.util.ArrayList;
import java.util.List;

import static Hackathon.Question_25.mergeArray;

public class Question_18 {
    public static void main(String[] arg){
       int[] array1 = {1,8,6,2,3,5,4,9};
        int i=0,l=0,h=array1.length-1,mid=0;
        int[] mergeSortedArray;
        System.out.println("Given Order of Array Elements are:");
        displayArray(array1);
        //System.out.println(l);
        //System.out.println(h);
        mergeSort(array1,l,h);
    } //end of main

    //call to mergeSort
    public static void mergeSort(int[] a,int l, int h) {
        int[] m = new int[a.length];
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(a, l, mid); //first half
            mergeSort(a, mid + 1, h); //second half call
            merge(a,l,mid,h); // merging
        }
    }

    //method ot merge given array,low,mid and high parameters
    public static void merge(int[] a, int l,int m,int  h){
        int leftArray_len=(m-l+1);
        int rightArray_len=h-m;
        int[] leftArray = new int[leftArray_len];
        int[] rightArray = new int[rightArray_len];
        int i=0;
        for(i=0;i<leftArray_len;i++)
            leftArray[i]=a[l+i];
        for(i=0;i<rightArray_len;i++)
            rightArray[i]=a[m+1+i];

        i=0;
        int j=0,k=l;

        //System.out.println("Left array is: ");
       // displayArray(leftArray);
        //System.out.println("Right array is :");
        //displayArray(rightArray);
        while (i < leftArray_len && j < rightArray_len) {
            if (leftArray[i] <= rightArray[j]) {//element of a < element of b copy element a into result array
                a[k++] = leftArray[i++];

            } else { //copy elemnt b into result array
                a[k++] = rightArray[j++];
            }//loop ends when one array is exhausted so copy remaining elements of lengthier array

            while (i < leftArray_len) {
                a[k++] = leftArray[i++];
            }
            while (j < rightArray_len) {
                a[k++] = rightArray[j++];
            }
        }
        displayArray(a);
    }

    //method to display Arrays
    public static void displayArray(int[] a){
        System.out.println();
        System.out.print("[");
        for(int j=0;j<a.length;j++) {
            if(j!=(a.length-1))
                System.out.print(a[j] + ",");
            else
                System.out.print(a[j]);
        }
        System.out.print("]");
        System.out.println();
    }

}//end of class
