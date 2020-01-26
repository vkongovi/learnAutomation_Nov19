package Hackathon;
//to convert String to Integer
public class Question_15 {
    public static void main(String[] arg){
        String s="98";
        //int st_int = (int) s;
        int st_int = Integer.parseInt(s);
        System.out.println("One number more than "+s+" is "+(st_int+1));
    }
}
