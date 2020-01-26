package Exam1;

public class Question17 {
    public static void main(String[] arg){
        int array_num[] = new int []{7,2,4,1,3,5,6,8,2,10};
        int i=0,j=0,temp=0;        System.out.print("Input:");
        for(i=0;i<array_num.length;i++)
            System.out.print("\t"+array_num[i]+"\t");
        for(i=0;i<array_num.length;i++){
            for(j=i+1;j<array_num.length;j++){
                if (array_num[i]%2 !=0){
                    temp=array_num[i];
                    array_num[i]=array_num[j];
                    array_num[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Output:");
        for(i=0;i<array_num.length;i++)
            System.out.print("\t"+array_num[i]+"\t");
    }
}
