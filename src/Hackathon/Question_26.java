package Hackathon;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Question_26 {

    public static void main(String[] arg) {
        LinkedList<Circus> circusLinkedList = new LinkedList<>();
        circusLinkedList.add(new Circus(65, 100));
        circusLinkedList.add(new Circus(70, 150));
        circusLinkedList.add(new Circus(56, 90));
        circusLinkedList.add(new Circus(75, 190));
        circusLinkedList.add(new Circus(60, 95));
        circusLinkedList.add(new Circus(68, 110));


        Collections.sort(circusLinkedList);
        System.out.println("Sorted Circus Tower is:");

        Iterator<Circus> itr = circusLinkedList.iterator();
        while (itr.hasNext())  {
            Circus curr_val=itr.next();
            System.out.print("("+curr_val.height+","+ curr_val.weight+")");
        }
        }
    }

