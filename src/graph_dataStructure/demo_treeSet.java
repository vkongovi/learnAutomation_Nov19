package graph_dataStructure;
import java.util.*;
public class demo_treeSet {
    //the problem is about tree traversal - depth first search
    //can use a counter to check how many nodes traveresed from node a to b - to get the value of how far it is

    public static void main(String[] arg){
        TreeMap tm = new TreeMap();
        TreeSet ts = new TreeSet();
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        for (int i=0;i<10;i++) {
            ts.add(i);
            l1.add(i);
        }
        System.out.println(ts);
        System.out.println(l1);

    }
}
