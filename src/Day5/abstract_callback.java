package Day5;

abstract class abstract_callback implements Callback{
    @Override
    public void callback(String p_num) {
        System.out.println("This is message from abstract class implementing callback::"+" #### "+p_num+" #### ");

    }
}
