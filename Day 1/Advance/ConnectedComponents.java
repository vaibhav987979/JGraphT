package Advance;
import java.util.*;

public class ConnectedComponents {

    static void dfs(String vertex,
                    Map<String,List<String>> graph,
                    Set<String> visited){

        visited.add(vertex);
        System.out.print(vertex+" ");

        for(String neighbour:graph.get(vertex)){
            if(!visited.contains(neighbour)){
                dfs(neighbour,graph,visited);
            }
        }
    }

    public static void main(String[] args){

        Map<String,List<String>> graph=new HashMap<>();

        graph.put("A",Arrays.asList("B"));
        graph.put("B",Arrays.asList("A","C"));
        graph.put("C",Arrays.asList("B"));
        graph.put("D",Arrays.asList("E"));
        graph.put("E",Arrays.asList("D"));
        graph.put("F",new ArrayList<>());

        Set<String> visited=new HashSet<>();

        for(String vertex:graph.keySet()){

            if(!visited.contains(vertex)){
                dfs(vertex,graph,visited);
                System.out.println();
            }
        }
    }
}