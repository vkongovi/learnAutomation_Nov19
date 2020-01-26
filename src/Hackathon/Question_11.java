package Hackathon;
//to print reverse of every word in a given string
public class Question_11 {
    public static void main(String[] arg){

        String givenString="Java Code";
        String[] words;
        String reverseString="";
        words=givenString.split("\\s");
        for (String w :words) {
            System.out.println(w);
        }

        for(int i=words.length-1;i>=0;i--){
            reverseString=reverseString+reverse_word(words[i])+" ";
        }
        System.out.println(givenString);
        System.out.println(reverseString);
    }//end of main

    //method to find reverse of a given string
    public static String reverse_word(String s){
        int i=s.length()-1;
        String reverse_word= "";
        for(int j=i;j>=0;j--){
            reverse_word=reverse_word+s.charAt(j);
        }
        return reverse_word;
    }
}//end of class
