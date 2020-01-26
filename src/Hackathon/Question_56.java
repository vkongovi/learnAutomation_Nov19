package Hackathon;
//right angled triangle pattern of numbers
public class Question_56 {
    public static void main(String[] arg){
       char ch='9';
       int i=0,j=0,numberOfrows=5;
       for(i=0;i<numberOfrows;i++){
           System.out.println();
           for(j=0;j<=i;j++)
               System.out.print("\t"+ch);
       }
    }//end of main
}//end of class
