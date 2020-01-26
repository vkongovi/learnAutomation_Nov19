package Hackathon;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Question_65 {
    public static void main(String[] arg){
        List<Integer> ll1 = new LinkedList();
        int[] array1 = {34,78,45,1,98,23,56,12,4};
        int k=array1.length;
        int elementTocheck=4;

        for(int i=0;i<k;i++){
            ll1.add(array1[i]);
        }

        System.out.println(ll1.contains(elementTocheck));

    }
}
