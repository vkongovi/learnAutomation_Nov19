package Hackathon;
//Q62. Write a Java method to count all vowels in a string.
public class Question_62 {
    public static void main(String[] arg){
        String inputString="This is to check vowels count in a given string";
        int countOfvowels=0,len=inputString.length();
        char currentchar;
        for(int i=0;i<len;i++){
            currentchar=inputString.toLowerCase().charAt(i);
            if (currentchar=='a'||currentchar=='e'||currentchar=='i'||currentchar=='o'||currentchar=='u'){
                countOfvowels=countOfvowels+1;
            }
        }
        System.out.print("Given String is:");
        System.out.println(inputString);
        System.out.println("It has "+countOfvowels+ " vowels in it");


    }
}
