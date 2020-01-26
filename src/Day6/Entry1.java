package Day6;

import java.util.Collections;
import java.util.Iterator;
import java.lang.*;
import java.util.LinkedList;

import static java.util.Collections.*;

public class Entry1 {
    public static void main(String[] arg) {
        LinkedList<Integer> int_ll = new LinkedList<Integer>();
       // Node obj_node = new Node(); //no need to create an object of that class???
       // LinkedList<Node> nodes_ll = new LinkedList<Node>();
        int_ll.add(3);
        int_ll.add(3);
        int_ll.add(2);
        int_ll.add(44);
        //int_ll.add(null);
        int_ll.add(56);
        int_ll.add(2020);
       // System.out.println("Elements in added order");
        System.out.println(int_ll);
       // System.out.println("After adding 9601 to 5 th  position");

        //addding at ith position
        int_ll.add(5, 9601);
       // System.out.println(int_ll);

        //changing --setting value at a nth position
        int_ll.set(5, 7491);
        //System.out.println("After changing value of 9601 at 5 th  position to 7491");
        //System.out.println(int_ll);

        Iterator<Integer> itr = int_ll.iterator();
       // while (itr.hasNext()) {
       //    System.out.println("1 content is :- " + itr.next());
       // }

        //remove null element before invoking sort!!!!
        Collections.sort(int_ll);
        //need to crate new iterator
        Iterator<Integer> itr1 = int_ll.iterator();
       // while (itr1.hasNext()) {
        //    System.out.println("2 contents of linked list is:- " + itr1.next());
        //}

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.addAll(int_ll);

        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Vinaya",99)) ;
        studentList.add(new Student("James",056)) ;
        studentList.add(new Student("Kavya",034)) ;
        studentList.add(new Student("Arjun",004)) ;
        studentList.add(new Student("Sanjay",015)) ;
        studentList.add(new Student("Shyama",023)) ;


       Iterator<Student> stud_it = studentList.iterator();
        while (stud_it.hasNext()) {
            Student currentStudent_val=stud_it.next();
            System.out.println("Student is: " + currentStudent_val.roll_no +" Names "+currentStudent_val.name);
        }

       Collections.sort(studentList);
        System.out.println("Sorted student list");

        Iterator<Student> itr4 = studentList.iterator();
        while (itr4.hasNext()) {
            Student currentStudent_val=itr4.next();
            System.out.println("Student is: " + currentStudent_val.roll_no +" Names "+currentStudent_val.name);
        }
    }
}

