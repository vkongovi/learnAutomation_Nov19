package graph_dataStructure;

public class treeTraversal {
    public static void main(String args[])
    {
        tree_DFS obj = new tree_DFS(10);

        obj.addEdgesToGraph(1,9);
        obj.addEdgesToGraph(9,3);
        obj.addEdgesToGraph(9,7);
        obj.addEdgesToGraph(9,0);
        obj.addEdgesToGraph(0,8);
        obj.addEdgesToGraph(0,6);
        obj.addEdgesToGraph(0,4);
        obj.addEdgesToGraph(4,2);
        obj.addEdgesToGraph(4,5);

        obj.DFSearch(1);
    }
}

