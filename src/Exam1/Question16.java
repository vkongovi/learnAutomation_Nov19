package Exam1;

public class Question16 {
    public static void main(String[] arg){
        int array1[] = new int[]{0, 8, 4, 0, 1, 9, 6, 0};
        int i=0,j=0;
        int temp=0;

        System.out.print("Input:");
        for(i=0;i<array1.length;i++)
            System.out.print("\t"+array1[i]+"\t");
        for(i=0;i<array1.length;i++){
            for(j=i+1;j<array1.length;j++){
                if (array1[i]==0 && array1[j]!=0){
                    temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Output:");
        for(i=0;i<array1.length;i++)
            System.out.print("\t"+array1[i]+"\t");
    }
}
