package Day4;

public class Assignment_26 {
    public static void main(String[] arg){
        int firstArray[] = {50,-20,0};
        int secondArray[]={5,-50,10};
        int newArray[]= new int[2];
        int i=0,j=0;
        System.out.print("Elements of First Array are :");
        displayArray(firstArray);
        System.out.println();
        System.out.print("Elements of Second Array are :");
        displayArray(secondArray);
        System.out.println();
        newArray[0]=firstArray[0];
        newArray[1]=secondArray[((secondArray.length)-1)];
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
}//end of class
