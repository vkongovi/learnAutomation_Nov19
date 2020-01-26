package Day6;

//defining node object
public class Node {
    String node_name;
    int has_connections;

    Node(String nodes, int count) {
        node_name = nodes;
        has_connections = count;
    }
}
