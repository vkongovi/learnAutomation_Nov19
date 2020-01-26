package graph_dataStructure;

import java.util.Scanner;

public class invoke_QuickFindUF {
    public static void main(String[] arg){
        System.out.println("This is main method ");
        QuickFindUF qf = new QuickFindUF();
        boolean flag=false;
        qf.createCityNodes(10);
        //qf.displayConnectivity();
        qf.connectCity(1,9); //node 3 (child) is connected  to node 2 (parent)
        qf.connectCity(9,3);
        qf.connectCity(9,7);
        qf.connectCity(9,0);
        qf.connectCity(0,8);
        qf.connectCity(8,6);
        qf.connectCity(0,4);
        qf.connectCity(4,2);
        qf.connectCity(4,5);
        qf.displayConnectivity();
        int M=qf.Nodes.length;
        System.out.println(" The Number of Cities are :"+M);
        System.out.println("The Number of Connections are :"+(M-1));
        //finding how far from root is a city
        int k=0;
        int[] Connections = new int[M];
        int levels=0,level0=0,level1=0,level2=0,level3=0;
        for(int i=0;i<M;i++) {
            levels = qf.distanceToRoot(i);
            if (levels==0) {
                System.out.println("Node " + i + "  is the Capital/Root");
                Connections[k] = levels;
            }
            else {
                System.out.println("Node "+i+"  is:" + (levels) + " levels from root");
                switch (levels) {
                    case 1:
                        level0 = level0 + 1;
                        System.out.println(" level0 "+level0);
                        Connections[k] = level0;
                        break;
                    case 2:
                        level1 = level1 + 1;
                        System.out.println(" level1 "+level1);
                        Connections[k] = level1;
                        break;
                    case 3:
                        level2 = level2 + 1;
                        System.out.println(" level2 "+level2);
                        Connections[k] = level2;
                        break;
                    case 4:
                        level3 = level3 + 1;
                        System.out.println(" level3 "+level3);
                        Connections[k] = level3;
                        break;
                }
            }
            k=k+1;
        }
        System.out.println("Value of k is "+k);
        for (int j=0;j<=M-1;j++) {
            System.out.print("\t" + j +"\t");
        }
        System.out.println();
        for (int j=0;j<=M-1;j++) {
            System.out.print("\t" + Connections[j] + "\t" );
        }
    }//end of main
}//end of class
