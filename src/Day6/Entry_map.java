package Day6;

import com.company.Car;

import java.util.HashMap;

public class Entry_map {
    public static void main(String[] arg){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(0,"P");
        hm.put(4,"M");hm.put(2,"R");
        hm.put(8,"Q");hm.put(3,"T");
        hm.put(6,"U");

        HashMap<Integer,Student> hm1 = new HashMap<>();
        Student st1 = new Student("Vishal",55);
        hm1.put(st1.roll_no,st1);//first value for hashmap is integer and second value string so st1 is enough??
        // sorting done based on key not values (key,value)
        //as student class/object has
        HashMap<Student, Car> hm2 = new HashMap<>();


    }
}
