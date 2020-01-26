package Day6;

import java.util.*;
public class queue_list {
    public static void main(String[] arg){
        Queue<String> q1 = new LinkedList<>();

        //Queues FIFO
        q1.add("Vinaya");
        q1.add("Sharath");
        q1.add("Vidhya");
        q1.add("Sooraj");
        int i=0;
        int qsize = q1.size();
        System.out.println(qsize);
        System.out.println(q1.size());
        //for (int i=0;i<qsize;i++){
        //do not use q1.size() - as q1.poll keeps changing the queue size dynamically
        while (i<qsize){
            System.out.println("value"+i+" is: "+q1.poll());
            i=i+1;
        }
        System.out.println();

        //Stacks LIFO
        Stack<String> st = new Stack<>();
        st.push("Sharath");
        st.push("Purab");
        st.push("Akash");
        st.push("Udita");
        st.push("Pragnya");
        st.push("spoorti");

       /* st.forEach(n->{
            System.out.print("\t"+n+"\t");
        });*/
        System.out.println();
        System.out.println("-------------------Now pulling out from stack------------------");
        int stacksize =st.size();
        for(i=0;i<stacksize;i++) {
            System.out.println(st.pop());
            if (st.size() >0) {
                System.out.println(st.peek());System.out.println(st.size());
            }
        }
    }

}
