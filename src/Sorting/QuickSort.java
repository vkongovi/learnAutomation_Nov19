package Sorting;

import static Sorting.CreateElementsOfArray.displayArray;

public class QuickSort {
    public static void main(String[] arg) {
        //create object createElementsOfArray
        //CreateElementsOfArray create_obj = new CreateElementsOfArray();
        //access the method to create an array and display it
        int[] a;
        a = CreateElementsOfArray.enterArrayValues();
        displayArray(a);
        //call the method to quickSort passing the array ,lb and upperbound
        int lb = 0, ub = a.length-1;
        System.out.println("lower bound: " + lb + ",<===>" + "upper bound: " + ub);
        quickSort(a, lb, ub);
        System.out.println("After sorting:");
        displayArray(a);
    }//end of main class


    public static void quickSort(int[] a, int lb, int ub) {
        int mid_loc;
        if (lb < ub) {
            mid_loc = partitionArray(a, lb, ub);
            //System.out.println(mid_loc);
            quickSort(a, lb, mid_loc);
            quickSort(a, mid_loc + 1, ub);
        }
    }


    private static int partitionArray(int[] a, int lb, int up) {
        int pivot_element = a[lb];
        int start = lb;
        int end = up;
        while (start < end) {
            while (a[start] <= pivot_element) {
                start = start + 1;
            }
            while (a[end] > pivot_element) {
                end = end - 1;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        //System.out.println("After fixing the pivot element after pass # :" + start);
        // displayArray(a);
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;
        // System.out.println("Mid "+end);
        return end;
    }
}



