package Exam1;

public class swap_without_temp {
    public static void main(String[] arg){
        int a=3,b=4;
        System.out.println("-------Before swapping-----");
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("-------After swapping-----");
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
    }
}
