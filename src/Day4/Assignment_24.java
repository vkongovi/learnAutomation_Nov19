package Day4;

public class Assignment_24 {
    public static void main(String[] arg){
        int[] array1 = new int[] {10, -20, 0, 30, 40, 60, 10};
                //{2,4,56,2,567,3465,67,0};
        //System.out.println(array1.length);
        boolean check = false;
        int first_element=array1[0];
        int last_element=array1[(array1.length-1)];
        //System.out.println(array1[0]);
        //System.out.println(array1[(array1.length-1)]);
        if (first_element ==10 || last_element ==10)
            check = true;
        else
            check = false;

        System.out.println("Output is "+check);

    }
}
