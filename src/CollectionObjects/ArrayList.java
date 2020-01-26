package CollectionObjects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String arg[]){
        System.out.println("This is a main Method to invoke for all collection objects");
        createArrayList();
    }

    public static void createArrayList(){
        System.out.print("Enter how many object you want to create ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arraylist1 = new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter element value:");
            int elementValue=sc.nextInt();
            arraylist1.add(elementValue);
        }

        //method to display an arrayList
       /* public static void displayArrayList(){
            Iterator<Integer> itr = arraylist1.iterator();
            while (itr.hasNext()) {
                System.out.println("content is :- " + itr.next());
            }
        }*/
    }
}

//method to invoke how many number of collection object is to be created
