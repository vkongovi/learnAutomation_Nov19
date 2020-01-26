package Day4;
//grand parent
public class access_modifiers {
    //private variable only to this class not anywhere else
    private int ssn=23;
    public int phone_num=5554356;
    public int protected_bank_acct_num=789;
    //System.out.println("Test");
    public void am_Method(){
        System.out.println("test");
        System.out.println("ssn value is "+ssn);
        System.out.println("The value of phone number from inside its own class ::"+phone_num);
        System.out.println("The value of bank account # :protected ::"+protected_bank_acct_num);
    }
}
