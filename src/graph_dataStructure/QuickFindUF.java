package graph_dataStructure;

public class QuickFindUF {
    int[] Nodes;
    public QuickFindUF(){
        //System.out.println("default constructor without parameter");
    }

    public QuickFindUF(int num){
        //System.out.println("Overridden with length of array as paramter");
        Nodes = new int[num];
        for (int i=0;i<num;i++)
            Nodes[i]=i;
    }
    //method to create a city of n nodes
    public void createCityNodes(int numberOfNodes){
        //System.out.println("Inside the method");
            Nodes = new int[numberOfNodes];
            for (int i = 0; i < numberOfNodes; i++) {
                Nodes[i] = i;
            }
    }

    //method to connect two nodes
    public void connectCity(int p, int q){
        int pid=p,qid=q;
        for(int i=0;i< Nodes.length;i++)
            if (i==qid)
                Nodes[i]=pid;
    }

    //cchecks if two nodes are connected
    public boolean isConnected(int p,int q){
        int pid=p,qid=q;
        if (Nodes[qid]==pid)
            return true;
        else
            return false;

    }

    //depth of a note from root
    public int distanceToRoot(int CityNode){
        int searchCity = CityNode;
        int counter=0;
        while(Nodes[searchCity]!=searchCity){
            searchCity=Nodes[searchCity];
            counter=counter+1;
        }
        return counter;
    }

    public void displayConnectivity(){
        for(int i=0;i<Nodes.length;i++)
            System.out.println("Node  ("+i+") connects to ==>"+Nodes[i]);
    }

}
