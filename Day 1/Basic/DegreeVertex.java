package Basic;
import java.util.*;

public class DegreeVertex {

    static Map<String,List<String>> graph=new HashMap<>();

    static void addEdge(String u,String v){
        graph.putIfAbsent(u,new ArrayList<>());
        graph.putIfAbsent(v,new ArrayList<>());

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static int degree(String vertex){
        return graph.get(vertex).size();
    }

    public static void main(String[] args){

        addEdge("A","B");
        addEdge("A","C");
        addEdge("B","D");

        System.out.println("Degree of B = "+degree("B"));
    }
}
