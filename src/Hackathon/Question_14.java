package Hackathon;
//to find duplicate characters and print
//
public class Question_14 {
    public static void main(String[] arg) {
     String str="Advanced Java";
     int count=0,i=0,j=0,len=str.length();
     char charArray[] = str.toCharArray();
        System.out.println("Give String is :"+str);
     for(i=0;i<len;i++){
         for(j=i+1;j<len;j++){
             if (charArray[i]==charArray[j] && charArray[i]!=' '){
                    count=count+1;
                    charArray[j]='#'; //
             }
         }//end of j for loop - looked through the string for first character duplicates
         if (count>1 && (charArray[i]!='#')){
             System.out.println("The character "+charArray[i]+" is a duplicate ");
         }
     }
    }
}
