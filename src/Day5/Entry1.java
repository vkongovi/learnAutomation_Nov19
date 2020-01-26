package Day5;

//String
//StringBuffers
//StringBuilders
//Interface
//Abstract classes
public class Entry1 {
    public static void main(String[] arg){
        String str1="Vinaya";
        StringBuilder s2 = new StringBuilder("Vinaya");
        StringBuffer s3 = new StringBuffer("vinaya --");

        concat1(str1);
        System.out.println("String after calling the method: "+str1);

    }

    public static void concat1(String s1){
        s1 = s1+"Kongovi";


    }

    public void concat2(String s2){

    }
}

