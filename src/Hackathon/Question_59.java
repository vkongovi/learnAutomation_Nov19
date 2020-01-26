package Hackathon;
//Q59. Write a Java program to convert minutes into a number of years and days.
public class Question_59 {
    public static void main(String[] arg){
        float minutes=60.00f,hours=24.00f,days=365.00f;

        //System.out.println("In 1 hour there are "+minutes+ " minutes");
        //System.out.println("In 24 hours there "+hours*minutes+" minutes");
        //System.out.println("In 1 day there are "+hours*minutes+" minutes");
        System.out.println("A minute is equivalent to "+(1/(hours*minutes))+" days");
        //System.out.println("In 365 days there are "+days*hours*minutes+" minutes");
        //System.out.println("In a year there are "+days*hours*minutes+" minutes");
        System.out.println("A minute is equivalent to "+(1/(hours*minutes*days))+" of a year");


    }

}
