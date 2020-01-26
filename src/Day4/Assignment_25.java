package Day4;

public class Assignment_25 {
    //to rotate numbers in an array
    public static void main(String[] arg){
        int[] numArray = {40,30,50,60,10,15};
        int arrayLength=numArray.length,j=0,i=0;
        //storing element at index 0
        int last_element=numArray[0];
        //call to display arrayNumbers;
        displayArray(numArray);
        //shifting elements to left from index 1 onwards
        for(i =1;i<arrayLength;i++){
                numArray[j] = numArray[i];
                j=j+1;
        }
        numArray[j]=last_element;
        System.out.println();
        System.out.println("After shifting Elements to left ...");
        //to display array numbers
        displayArray(numArray);
    }//end of main

    private static void displayArray(int[] a) {
        System.out.println("Array Elements are");
        for(int j=0;j<a.length;j++)
            System.out.print("\t"+a[j]+"\t");

    }


}//end of class
