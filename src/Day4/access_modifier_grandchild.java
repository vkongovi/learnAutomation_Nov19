package Day4;

public class access_modifier_grandchild extends access_modifier_child {

    public void am_grandchild_method() {
        System.out.println("The value of bank account from grand child method # :protected ::" + protected_bank_acct_num);
    }
}
