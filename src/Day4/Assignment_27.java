package Day4;

public class Assignment_27 {
    public static void main(String[] arg){
        int firstArray[] = {50,40,30};
        int length_inputArray=firstArray.length;
        int newArray[]= new int[length_inputArray];
        int i=0,j=0;
        System.out.print("Elements of First Array are :");
        displayArray(firstArray);
        System.out.println();
        newArray[0]=firstArray[(length_inputArray)-1];
        newArray[length_inputArray-1]=firstArray[0];
        for(i=1;i<length_inputArray-1;i++)
            newArray[i]=firstArray[i];
        System.out.println();
        System.out.print("Elements of New Array are :");
        displayArray(newArray);

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
}
