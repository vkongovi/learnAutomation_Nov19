package Day5;

public class Client_returncall implements Returncall,Callback {
    @Override
    public void callback(String cell_number) {
        System.out.println("This message is from :: "+this.getClass()+" :: implementing the Returncall interface");
    }
}
