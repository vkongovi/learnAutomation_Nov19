package Exam1;

public class Question14 {
    public static void main(String[] arg){
        int a[] = new int[] {1, 4, 20, 7, 25, 35, 100};
        int len=0,total=0;
        float avg_array= (float) 0.0;
        len=a.length;
        System.out.println("Length is "+len);
        for(int i=0;i<len;i++)
            total=total+a[i];
        avg_array=total/len;
        System.out.println("Average is "+avg_array);
        for (int i=0;i<len;i++){
            if (a[i] > avg_array)
                System.out.println("\t"+a[i]);

        }



    }
}
