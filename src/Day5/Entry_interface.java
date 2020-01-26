package Day5;

import com.company.Entry;

public class Entry_interface implements Callback,Returncall {
    public static void main(String args[]){
        Client_callback call_back_clt = new Client_callback();
        Client_returncall return_call_clt = new Client_returncall();
        Entry_interface obj_entry = new Entry_interface();
        call_back_clt.callback("4085559090");
        return_call_clt.callback("6505559090");
        obj_entry.callback("905444987");

    }

    @Override
    public void callback(String p_num) {
        System.out.println("This is message from ::"+this.getClass()+" :: Main!!");
    }
}
