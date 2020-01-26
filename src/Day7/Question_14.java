package Day7;

public class Question_14 {
    public static void main(String[] arg) {
        String input_str = "Advanced Java and Selenium";
        //String input_str="mathematician";
        int str_len = input_str.length();
        boolean array_bool[] = new boolean[str_len];
        int array_count[] = new int[str_len];
        char char1 = ' ';
        boolean bool = false;
        int count = 1, i = 0, j = 0;
        for (i = 0; i < str_len; i++) {
            bool = false;
            count = 1;
            char1 = input_str.charAt(i);
            //System.out.println("character is now :"+char1);
            for (j = 0; j < str_len; j++) {
                if (input_str.charAt(j) == char1 && i != j) {
                    //System.out.println("input at :"+j+" is -"+input_str.charAt(j));
                    bool = true;
                    count = count + 1;
                    array_bool[i] = bool;
                    array_count[i] = count;
                }
                array_count[i] = count;
            }
        }
        for (i = 0; i < str_len; i++) {
            if (array_count[i] != 1) {
                System.out.println("The character\t" + input_str.charAt(i) + "\t occures  \t" + array_count[i] + "\t times");
                System.out.println();
            }
        }

    }
}