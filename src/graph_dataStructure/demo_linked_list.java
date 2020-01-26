package graph_dataStructure;
import java.util.*;

public class demo_linked_list {
    public static void main(String[] arg){
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        for (int i=0;i<10;i++)
            l1.add(i);


        System.out.println("Original contents of ll: " + l1);
        l1.remove(3);
        System.out.println("Original contents of ll: " + l1);
        l1.removeLast();
        System.out.println("Original contents of ll: " + l1);
        int a=4;
        System.out.println(l1.contains(a));
    }
}
