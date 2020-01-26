package Hackathon;

public class Question_13 {
    public static void main(String[] arg){
        String str="This is HACKATHON for Batch that Started @ :: 2019Nov19 ";
        int countOfInt=0,countOfLowercase=0,countOfUppercase=0,totalLength=0;
        int inputStringLength=str.length();
        System.out.println(inputStringLength);
        //loop through to see the character at i th position using if inside for
        for(int i=0;i<inputStringLength;i++){
            char currentChar=str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z'){ countOfUppercase=countOfUppercase+1;}
            else if (currentChar >= 'a' && currentChar <= 'z'){ countOfLowercase=countOfLowercase+1;}
            else if (currentChar >= '0' && currentChar <= '9'){ countOfInt=countOfInt+1;}
        }
        System.out.println("The Given Input String is-->"+str);
        System.out.println("The Character details of it are:");
        System.out.println("Upper Case Characters: "+countOfUppercase);
        System.out.println("Lower Case Characters: "+countOfLowercase);
        System.out.println("Integer Characters: "+countOfInt);
        int countOfSplChar=inputStringLength-(countOfInt+countOfUppercase+countOfLowercase);
        System.out.println("The blank and special Characters: "+countOfSplChar);


    }//end of main
}//end of class
