package Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//unique words in a given string
//using in-built split function of java string class - get an array of words
//loop that string array to store in a list (collection object)
//now sort the collection object
//store previous removed/referenced element - if previous == current - skip printing output
public class Question_12 {
    public static void main(String[] arg){
        List<String> listStrings = new ArrayList<String>();
        String givenString="the cat in the hat book ";
        String[] words;
        String previous="",current="";
        boolean flag=false;
        words=givenString.split("\\s");
        for(int i=0;i<words.length;i++){
            listStrings.add(words[i]);
        }
        System.out.println("Given String is:"+givenString);
       // System.out.println("Before sort");
       //System.out.println(listStrings);

        Collections.sort(listStrings);
       // System.out.println("After Sorting");
        //System.out.println(listStrings);
        //iterate through it to check previous and current value
        Iterator<String> itr = listStrings.iterator();
        System.out.println("Unique words in it are :");
        while(itr.hasNext()){
            current=itr.next();
            //System.out.println("Current is" + current);
            //System.out.println("Previous is::"+previous);
            if(previous.compareTo(current)!=0){
                System.out.println(current);
            }
                previous = current;
        }
    }//end of main
}//end of class
