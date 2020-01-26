package Sorting;

import static Sorting.CreateElementsOfArray.displayArray;

//during each traversal the lowest or the highest element is fetched and swapped with the current comparator -
// comparator is usually the first element of the unsorted array
//the size of sorted and unsorted keeps increasing and decreasing during each iteration
public class SelectionSort {
    public static void main(String[] arg){
        System.out.println("Selection Sort");
        //int array[] = {7,4,10,8,3,1};
        int[] array;
        array = CreateElementsOfArray.enterArrayValues();
        displayArray(array);
        /*System.out.println("Number of elements are :"+array.length);
        System.out.println("So passes will be :"+(array.length-1)+" or from 0 :"+(array.length-2));*/
        System.out.println("Elements before Sorting:");
        displayArray(array);
        SelectionSort(array);
        System.out.println("Elements after Sorting:");
        displayArray(array);

    }//end of main class

    public static void SelectionSort(int[] a){
        for(int i =0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if (a[j]< a[min]){
                    min=j;
                }
                if (min!=i){
                    //swap a[i] to have the lowest/highest
                    int temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
                }
            }
            //after first pass the minimum element is at first position
            System.out.println("After pass #:"+i);
            displayArray(a);

       }
    }
}


