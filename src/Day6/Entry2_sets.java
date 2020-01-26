package Day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Entry2_sets {
    public static void main(String[] arg){
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        hs.add(21);  lhs.add(1201); ts.add("9");
        hs.add(21); lhs.add(234); ts.add("5");
        hs.add(16); lhs.add(565); ts.add("8");
        hs.add(456); lhs.add(56); ts.add("0");
        hs.add(98); lhs.add(999); ts.add("2");
        hs.add(402); lhs.add(555); ts.add("1");
        hs.add(2020); lhs.add(1); ts.add("3");

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }
}
