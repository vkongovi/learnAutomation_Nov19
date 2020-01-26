package Day4;

public class Assignment_28 {
    public static void main(String[] arg){
        int firstArray[] = {20,30,40,50,67};
        int length_inputArray=firstArray.length;
        int i=0,mid_index=0,lb=0,ub=0,mid=0;
        System.out.print("Elements of the Array are :");
        displayArray(firstArray);
        System.out.println();
        mid_index=(i+length_inputArray-1)/2;
        //System.out.println(length_inputArray);
        //finding the first,last and mid elements of the array
        lb=firstArray[0];
        ub=firstArray[length_inputArray-1];
        mid=firstArray[mid_index];
       //check for largest among these values
        if (lb>ub && lb>mid){
            System.out.println("Largest element between first, last, and middle values: "+lb);
        }
        else if (mid > lb && mid > ub){
            System.out.println("Largest element between first, last, and middle values: "+mid);
        }
        else if(ub > lb && ub > mid){
            System.out.println("Largest element between first, last, and middle values: "+ub);
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
}
