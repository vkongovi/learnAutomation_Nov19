package Day4;

public class Assignment_29 {
    public static void main(String[] arg){
        int firstArray[] = {1,5,-7,4};
        int secondArray[]={1,4,-5,-2};
        int newArray[]= new int[firstArray.length];
        int i=0,j=0;
        System.out.print("Array1:");
        displayArray(firstArray);
        System.out.println();
        System.out.print("Array2:");
        displayArray(secondArray);
        System.out.println();
        System.out.print("Result: ");
        //looping to find product of respective elements
        for(i=0;i<firstArray.length;i++){
            System.out.print(firstArray[i]*secondArray[i]+"\t");
        }

    }//end of main

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
} //end of class
