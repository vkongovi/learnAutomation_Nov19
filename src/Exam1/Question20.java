package Exam1;

public class Question20 {
    public static void main(String[] arg){
        String input_str="additional CONCEPTS in JAVA 1233";
        //String input_str="mathematician";
        int str_len = input_str.length();
        boolean array_bool[] = new boolean[str_len];
        int array_count[] = new int[str_len];
        char char1=' ';
        boolean bool=false;
        int count=1,i=0,j=0;
        for (i=0;i<str_len;i++){
            bool=false;
            count=1;
            char1=input_str.charAt(i);
            //System.out.println("character is now :"+char1);
            for(j=0;j<str_len;j++){
                if (input_str.charAt(j) == char1 && i!=j){
                    //System.out.println("input at :"+j+" is -"+input_str.charAt(j));
                    bool=true;
                    count=count+1;
                    array_bool[i]=bool;
                    array_count[i]=count;
                }
                array_count[i]=count;
                }
        }
        for (i=0;i<str_len;i++)
           System.out.println("The character\t" + input_str.charAt(i) + "\t occures \t"+array_count[i]+"\t times");
        System.out.println();
        for (i=0;i<str_len;i++) {
            if (array_bool[i]==false) {
                System.out.print("Index of the first non repeating character is: "+i);
                break;
            }
        }

    }
}
