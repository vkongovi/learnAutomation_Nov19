package Day2;

public class Assignment_11 {
    public static void main(String[] arg){
        System.out.print("Divided by 3: ");
        for (int i=1;i<100;i++) {
            if (i % 3 == 0)
                System.out.print(i+"\t");
        }
        System.out.print("\n Divided by 5: ");
        for (int i=1;i<100;i++) {
            if (i % 5 == 0)
                System.out.print(i+"\t");
        }
        System.out.print("\n Divided by 3 & 5: ");
        for (int i=1;i<100;i++) {
            if  ((i%3 == 0) && (i%5 == 0))
                System.out.print(i+"\t");
        }
    }
}
