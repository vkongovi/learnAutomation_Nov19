package Day5;

public class Client_callback extends abstract_callback implements Callback,Returncall {
    @Override
    public void callback(String p_num) {
        super.callback("9998884444");
        System.out.println("This is message from ::" + this.getClass() + " :: implementing the Callback interface");
    }

}
