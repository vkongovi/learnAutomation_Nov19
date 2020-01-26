package Day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Assignment_32 {
    public static void main(String[] arg) {
        List<Integer> l1 = new LinkedList();
        int user_input_array[] = {1, 2, 3, -6, 5, 4};
        int removedElementFromList=0,sum=0,i=0;
        //call adding elements to stack
        for (i=0;i<user_input_array.length;i++){
            addToList(l1,user_input_array[i]);
        }
        System.out.println(l1);
        Iterator<Integer> itr1 = l1.iterator();
        l1.toArray();
        while (itr1.hasNext()){

        }

    } //end of main

    static void addToList(List l1,int num){
            l1.add(num);
    }

} //end of class