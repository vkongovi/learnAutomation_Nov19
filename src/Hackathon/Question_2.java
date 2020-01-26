package Hackathon;

public class Question_2 {
    public static void main(String[] arg) {
        int[] arrayInput = {58, 234, 1,45,18,90,32};
        int i = 0, j = 0, arrayLength = 0, temp = 0;
        System.out.println("Original Given Array elements are...");
        displayArray(arrayInput);
        System.out.println();
        arrayLength=arrayInput.length;
        for (i = 0; i < arrayLength; i++) {
            for (j = i + 1; j < arrayLength; j++) {
                if (arrayInput[i] > arrayInput[j]) {
                    temp = arrayInput[i];
                    arrayInput[i] = arrayInput[j];
                    arrayInput[j] = temp;
                }
            }
        }
        //end of for loop
        System.out.println("Sorted Array elements ");
        displayArray(arrayInput);

    } //end of main

    //method to display Arrays
    public static void displayArray(int[] a) {
        System.out.print("[");
        for (int j = 0; j < a.length; j++) {
            if (j != (a.length - 1))
                System.out.print(a[j] + ",");
            else
                System.out.print(a[j]);
        }
        System.out.print("]");
    }
}

