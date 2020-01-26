package Hackathon;
///Theory Questions
public class Theory_Questions {
    public static void main(String[] arg) {
        String S = new String("Vinaya Kongovi");
        String givenString="Java Web Services API";
        String[] words;
        String SU = new String("HACKATHON");
        String sl= new String("hackathon");
        StringBuilder sbld = new StringBuilder("VINAYA");
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Using String ::"+S);
        System.out.println("Using StringBuilder ::"+sbld);
        System.out.println("Using StringBuffer ::"+sbf);
        System.out.println("String to lowercase ::"+SU.toLowerCase());
        System.out.println("String to Uppercase ::"+sl.toUpperCase());
        System.out.println("Sub sequence in Java ::"+sl.subSequence(0,4));
        words=givenString.split("\\s");;
        for (String w :words) {
            System.out.println(w);
        }
        System.out.println(words.length);

        int l=14;
        l=l-l%3;
        System.out.println(l);
        for(int j=0;j<l;j+=3){
            System.out.println("value of j is"+j);

        }
    }

}
