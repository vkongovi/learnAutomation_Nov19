package Day3;

public class SumToN {
    public static void main(String arg[]){
        int a[] = {5,15,25,35,45,55,65,75,85,95};
        for(int i=0;i<a.length;i++) {
            int q=a[i]/2;
            int r=a[i]%2;
           // System.out.println("when "+a[i]+" is divided by 2 - Quotient is :"+q+" and remainder is :"+r);
        }
        int num=21;
        int i=1,sum=0,curr=0,prev=0;
        while(sum<=num){
            curr=i;
            sum=sum+i;
            prev=i-1;
            i=i+1;
        }
        int delta=sum-num;
        int consec_num=i-delta;
        System.out.println("Current is :"+curr);
        System.out.println("Previous is: "+prev);
        System.out.println("sum is :"+sum);
        System.out.println("Give number was :"+num);
        System.out.println("Counnter value is "+i);
        System.out.println("Delta is :"+delta);
        System.out.println("crossed number is:"+consec_num);
        if (delta+consec_num+prev+curr==num)
            System.out.println("they add up");
        else
            System.out.println("They dont");
    }
}
