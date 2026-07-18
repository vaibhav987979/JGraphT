package Basic;
import java.util.*;

public class BFSExample {

    static void bfs(Map<String,List<String>> graph,String start){

        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){

            String current=queue.poll();
            System.out.print(current+" ");

            for(String neighbour:graph.get(current)){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
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

        bfs(graph,"A");
    }
}