package Day6;

public class ConnectedCities {
    int T[] = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};
    int C[] = new int[T.length-1];
    public static void main(String arg[]) {
        ConnectedCities node = new ConnectedCities();
        boolean connected = false;
        for (int i = 0; i < node.T.length; i++) {
            if (node.T[i] == i) {
                System.out.println("Capital is City at " + i);
            }
            System.out.println("City :" + i + " is connected to ==>" + node.T[i]);

        }
        int levelZero=0,levelOne=0,levelTwo=0,levelThree=0;
        int counter=0;
        for(int i=0;i<node.T.length-2;i++){
            int pid=i;
            while(node.T[pid]!=pid){
                pid=node.T[pid];
                counter=counter+1;
                System.out.println("Counter value is "+counter);
               /* if (counter==1){
                    levelZero=levelZero+1;
                    node.C[counter]=levelZero;
                }
                else if (counter==2){
                    levelOne=levelOne+1;
                    node.C[i]=levelOne;
                }
                else if(counter==3){
                    levelTwo=levelTwo+1;
                    node.C[i]=levelTwo;
                }
                else if(counter==4){
                    levelThree=levelThree+1;
                    node.C[i]=levelThree;
                }*/
            }
            counter=0;
        }
       // System.out.println("Length of new array is :"+node.C.length);
       // for(int i=0;i<node.C.length;i++)
           // System.out.println(node.C[i]);

    }//end of main
}// end of class