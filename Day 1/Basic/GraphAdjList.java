package Basic;
import java.util.*;

public class GraphAdjList {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void display() {
        for (String vertex : graph.keySet()) {
            System.out.println(vertex + " -> " + graph.get(vertex));
        }
    }

    public static void main(String[] args) {

        addEdge("A","B");
        addEdge("A","C");
        addEdge("B","D");
        addEdge("C","D");

        display();
    }
}