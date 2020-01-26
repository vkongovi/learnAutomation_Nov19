package Sorting;

import static Sorting.CreateElementsOfArray.displayArray;

public class MergeSort {
    public static void main(String[] arg){
        int[] a;
        a = CreateElementsOfArray.enterArrayValues();
        displayArray(a);
        int lb=0,ub=a.length-1;
        System.out.println((lb+ub/2));
        System.out.println("Upper bound is:"+ub);
        mergeSort(a,lb,ub);//split - divide
    
     
    }
    
    public static void mergeSort(int[] a, int lb, int ub){
        int b[];
        if (lb < ub) {
            int mid=(lb+ub)/2;
            mergeSort(a,lb,mid);
            mergeSort(a,mid+1,ub);
            //method to merge
            merge(a,lb,mid,ub);
        }
        
    }
    
    public static void merge(int[] a,int lb,int mid,int ub){
        int i=0,j=0,k=0;
        int b[] = new int[a.length-1];
        i=lb;k=lb;
        j=mid+1;
        while (i<=mid && j <=ub){
            if (a[i] <=a[j]){
                b[k]=a[i];
                i=i+1;
            }
            else
            {
                b[k]=a[j];
                j=j+1;
            }
            k=k+1;
        }
        
        if(i> mid){
            while (j<=ub){
                b[k]=a[j];
                j=j+1;
                k=+1;
            }
        }
        else {
            while(i<=mid){
                b[k]=a[i];
                i=i+1;
                k=k+1;
            }
        }
        
        //copy all elements into a 
        for(k=lb;k<=ub;k++)
            a[k]=b[k];
    }
    
    
    
}
