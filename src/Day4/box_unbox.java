package Day4;

public class box_unbox {
    public static void main(String[] arg) {
        int i = 0;
        Integer j = 5;
        /* the primitive data type is assigned a value j - which is of Integer class /object  type
        the j is unwrapped from the Integer object to primitive data type
        this is unboxing*/
        i = j;
        System.out.println(i);//no error indicated
        //boxing is the opposite
        float f = 3.14f;
        Float  f1 = 6.0253f;
        /* when I want the primitive data type variable to have a value from an object data type
        it gets wrapped/wrapper class boxed as Float object (instead of float data type)
        */

        f1=f;
        System.out.println(f1); //no error indicated


    }
}
