package Hackathon;

public class Question_4 {
    public static void main(String[] arg){
        int[] array1={7,23,1,4,89,4,31};
        System.out.println("Given Array Order is:");
        displayArray(array1);
        array1=selectionSort(array1);
        System.out.println();
        System.out.println("Sorted Array is:");
        displayArray(array1);

    }

public static int[] selectionSort(int[] a){
        int l= a.length;
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(a[j]< a[min])
                    min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
}

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
}
