package Hackathon;
//Q25. You are given two sorted arrays, A and B, and
// A has a large enough buffer at the end to hold B.
// Write a method to merge B into A in sorted order.
public class Question_25 {
    public static void main(String[] arg){
        int[] A = {6,17,29,32,41,56,63,72,88,90};
        int[] B = {2,5,9,14,19,20};
        int[] mergedArray;
        System.out.println("Given Array1 :");
        displayArray(A);
        System.out.println();
        System.out.println("Given Array 2 :");
        displayArray(B);
        System.out.println();
        mergedArray=mergeArray(A,B);
        System.out.println("Merged Sorted Array is");
        displayArray(mergedArray);
    }//end of main

    public static int[] mergeArray(int[] a,int[] b) {
        int i = 0, j = 0, k = 0, lena = a.length, lenb = b.length;
        int[] r = new int[lena+lenb];
        while (i < lena && j < lenb) {
            if (a[i] < b[j]) {//element of a < element of b copy element a into result array
                r[k++] = a[i++];
            } else { //copy elemnt b into result array
                r[k++] = b[j++];
            }//loop ends when one array is exhausted so copy remaining elements of lengthier array

            while (i < lena) {
                r[k++] = a[i++];
            }
            while (j < lenb) {
                r[k++] = b[j++];
            }
        }
        return r;
    }//end of method

    //method to display Arrays
    public static void displayArray(int[] a){
        System.out.print("[");
        for(int j=0;j<a.length;j++) {
            if(j!=(a.length-1))
                System.out.print(a[j] + ",");
            else
                System.out.print(a[j]);
        }
        System.out.print("]");
    }
}//end of class
