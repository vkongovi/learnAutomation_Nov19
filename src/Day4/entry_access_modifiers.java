package Day4;

public class entry_access_modifiers {
    public static void main(String[] arg){
    access_modifiers am = new access_modifiers();
    access_modifier_child amc = new access_modifier_child();
    access_modifier_grandchild amgc = new access_modifier_grandchild();

    //am.cannot fetch ssn variable as it is private
        am.am_Method(); //if that method is also private ??
        System.out.println("The phone number value declared as public in am class from main method is "+am.phone_num);

        amc.am_child_method();
        amgc.am_grandchild_method();


    }
}
