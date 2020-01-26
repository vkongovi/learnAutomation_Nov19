package Exam1;

public class Question2 {
    public static void main(String[] arg){
        int a[] = {2,1,6,8,2,5,8};
        boolean is_repeat=false;
        for (int i=0;i<=(a.length)-1;i++){
            int count=0;
            int pick=a[i];
            for (int j=0;j<=(a.length)-1;j++){
                if (a[j]==pick) {
                   // is_repeat = true;
                    count = count + 1;
                }
            }
            if (count==1)
                    System.out.println(pick + " appears only once - unique");
            else
                System.out.println(pick + " occurs "+count +" times");
        }
    }
}
