package Basic;
import java.util.*;

public class DFSRecursive {

    static void dfs(Map<String,List<String>> graph,
                    String vertex,
                    Set<String> visited){

        visited.add(vertex);
        System.out.print(vertex+" ");

        for(String neighbour:graph.get(vertex)){
            if(!visited.contains(neighbour)){
                dfs(graph,neighbour,visited);
            }
        }
    }

    public static void main(String[] args){

        Map<String,List<String>> graph=new HashMap<>();

        graph.put("A",Arrays.asList("B","C"));
        graph.put("B",Arrays.asList("A","D","E"));
        graph.put("C",Arrays.asList("A","F"));
        graph.put("D",Arrays.asList("B"));
        graph.put("E",Arrays.asList("B","F"));
        graph.put("F",Arrays.asList("C","E"));

        dfs(graph,"A",new HashSet<>());
    }
}