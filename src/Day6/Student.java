package Day6;

public class Student implements Comparable<Student> {
    String name;
    int roll_no;

    Student(String name,int num){
        this.name=name;
        this.roll_no=num;

    }

    @Override
    public int compareTo(Student student) {

        //returns 0 means both are equal
        // -ve means this is bigger
        //+ve means input/argument passed is bigger
       // return this.roll_no - student.roll_no; sorts in asencding order of roll number
        // return student.roll_no - this.roll_no; --sorts in descending order of roll number
        System.out.println("Comparing "+this.name+" with "+student.name);
         return this.name.compareTo(student.name); //sorts on names;
    }
}
