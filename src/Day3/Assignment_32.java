package Day3;

public class Assignment_32 {
    public static void main(String[] arg){
        int a[] = {-6,4,2,4,7};
        int sum=0,ub=0,i=0,lb=0;
        for(i=0;i<a.length;i++){
            System.out.println("Value of i is "+i+" and element at "+i+" is -"+a[i]);
            sum=sum+a[i];
            System.out.println("Sum is now :"+sum);
            if (sum==0) {
                break;
            }
        }
        ub=i;
        System.out.println("Upper bound value is :"+ub);
        System.out.println("Lower bound is :"+lb);
    }
}
