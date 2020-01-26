package graph_dataStructure;

import java.util.*;


public class tree_DFS {

    //no of vertices.
    int V;

    //we are building graph using adjacency list.
    //so we should have linked list for every node and store adjacent nodes of that node in that list
    LinkedList<Integer> adjList[];

    // constructor
    tree_DFS(int v)
    {
        V = v;
        adjList = new LinkedList[v];
        for (int i=0; i<v; ++i)
        {
            adjList[i] = new LinkedList();  //it will create empty list for every node
        }
        //System.out.println("Contents: "+adjList);
    }


    //adding edges to graph
    void addEdgesToGraph(int v, int u)
    {
        adjList[v].add(u);     //here it will add vertex to adjacency list of another vertex so that edge can be added to graph.
    }

    // depth first traversal is used by depth first search. it will traverse one strong component completely
    void DFTraversal(int v,int visited[])
    {
        visited[v] = 1;
        System.out.print(v + " ");
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (visited[n]==0)
                DFTraversal(n, visited);
        }
    }

    //depth first search will call depth fist traversal on disconnected components. it will keep track of visited[] array.
    void DFSearch(int v)
    {

        int visited[] = new int[V];

        DFTraversal(v, visited);
        for (int i=1;i<V;i++)
        {
            if(visited[i]==0)
            {
                DFTraversal(i, visited);
            }
        }
    }
}
