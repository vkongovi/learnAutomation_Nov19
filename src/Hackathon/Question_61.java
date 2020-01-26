package Hackathon;

public class Question_61 {
    public static void main(String[] arg){
        String inputString="Testing";
        int len=inputString.length(),midIndex=len/2;
        //System.out.println(len);
        //System.out.println(midIndex);
        System.out.println("Given string is :"+inputString);
        if (len%2==0){
            //extract mid and mid+1 character
            System.out.print("Middle characters are: ");
            System.out.println(inputString.charAt(midIndex)+inputString.charAt(midIndex+1));
        }
        else
        {
            //extract just character at mid
            System.out.print("Middle character is: ");
            System.out.println(inputString.charAt(midIndex));
        }

    }
}
