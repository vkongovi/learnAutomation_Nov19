package Hackathon;

public class ascii_check {
    public static void main(String[] arg){
        String s=" ";
        String s2="cat is blue and pink";
        String new_str="";
        int ascii_number,i=0;
        System.out.println("Ascii of "+s+" is :: "+(int) s.charAt(0));
        //System.out.println(s2.contains(" "));
        s2.replaceAll(" ","#");
        System.out.println(s2.matches(" "));
        System.out.println(s2);


    }
}
