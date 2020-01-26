package Day4;

public class Assignment_30 {
    public static void main(String[] arg) {
        int firstArray[] = {1,2,3,4};
        int secondArray[] = {8,7,9,5};
        int newArray[] = new int[2*firstArray.length];
        int i = 0, j = 0,temp=0;
        System.out.print("Array1 =");
        displayArray(firstArray);
        System.out.println();
        System.out.print("Array2 =");
        displayArray(secondArray);
        System.out.println();
        System.out.println(firstArray.length);
        System.out.println(secondArray.length);
        //looping to check elements of both the arrays
        for(i=0;i<firstArray.length-1;i++){
            int arr1_element=firstArray[i];
            System.out.println(arr1_element);
            for(j=0;j<secondArray.length-1;j++){
                if (arr1_element<secondArray[j]){
                    System.out.println(" "+arr1_element+"is <"+secondArray[j]);
                    newArray[i]=arr1_element;
                }
                else{
                    newArray[i]=secondArray[j];
                }
            }
        }
        System.out.println();
        System.out.print("result = ");
        displayArray(newArray);
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
}//end of class

