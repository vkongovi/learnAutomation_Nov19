package Day3;

import java.util.*;
import java.lang.*;

public class Assignment_19 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        int len1,len2;
        System.out.print("Enter Input String:");
        str1=sc.nextLine();
        System.out.print("Enter string to be verified:");
        str2 = sc.nextLine();
        len1=str1.length();
        len2=str2.length();
        //System.out.println(str1+": "+str1.length()+" - "+len1);
        //System.out.println(str2+": "+str2.length()+" - "+len2);
        //System.out.println(str1.substring((len1-len2),len1));
        System.out.println(str1.substring((len1-len2),len1).equalsIgnoreCase(str2));


    }

}
