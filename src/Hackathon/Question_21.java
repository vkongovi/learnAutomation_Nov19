package Hackathon;
//leap year
public class Question_21 {
    public static void main(String[] arg){
        int inputYear = 2020;
        if (inputYear%4==0) {
            if (inputYear%100==0){
                if (inputYear%400==0){
                    System.out.println("It is a leap year");
                }
                else System.out.println("It is not a leap year");
            }
            else System.out.println("It is  a leap year");
        }
        else System.out.println("Not a leap year");
    }
}
