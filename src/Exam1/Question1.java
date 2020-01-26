package Exam1;

public class Question1 {
    public static void main(String[] arg){
        boolean a=false;
        boolean b=true;
        boolean c=true;
        if ((a&&b) || (b&&c)||(c&&a))
            System.out.println("Two of the booleans are true");
        else
            System.out.println("Only one or none of them are false");

    }
}
