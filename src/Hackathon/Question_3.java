package Hackathon;


public class Question_3 {
    public static void main(String[] arg){
        int[] a = {9,1,0,1,2,9};
        //int[] a={14,22,35,66,53,22,41};
        String sb= new String();
        String s="";
        char[] charArray;
        int i =0,j=0;
        boolean flag=true;
        System.out.println("Given array is");
        for(int k:a)
            System.out.print("\t"+k+"\t");
        System.out.println();
        //creating a string of the number array
        sb=numberArraytoString(a);

        System.out.println("String is : "+sb);
        flag=palindromeCheck(sb);
        if (flag)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");

        //System.out.println(sb.length());
        }//end of main

    //method ot check a given string for palindrome -returns boolean
    public static boolean palindromeCheck(String s) {
        int j = s.length() - 1;
        int len = s.length(),i=0;
        boolean flag=true;
        while (i < len && j >= 0) {
            //System.out.println("i value is:"+i+" and j value is: "+j);
            if (s.charAt(i) != s.charAt(j)) {
                //System.out.println("Not a palindrome");
                flag = false;
                break;
            }
            i = i + 1;
            j = j - 1;
        }
        return flag;
    }

    //method to create a string of a number array
    public static String numberArraytoString(int a[]) {
        String sb= new String();
        String s="";
        for (int temp = 0; temp < a.length; temp++) {
            s = Integer.toString(a[temp]);
            sb = sb + s;
        }
        return sb;
    }
}
