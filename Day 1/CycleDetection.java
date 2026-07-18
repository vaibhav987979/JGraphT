package Advance;

import java.util.*;

public class CycleDetection {

    static boolean dfs(String node,
                       Map<String,List<String>> graph,
                       Set<String> visited,
                       Set<String> recursion){

        visited.add(node);
        recursion.add(node);

        for(String neighbour:graph.get(node)){

            if(!visited.contains(neighbour)){

                if(dfs(neighbour,graph,visited,recursion))
                    return true;

            }else if(recursion.contains(neighbour)){
                return true;
            }
        }

        recursion.remove(node);
        return false;
    }

    public static void main(String[] args){

        Map<String,List<String>> graph=new HashMap<>();

        graph.put("A",Arrays.asList("B"));
        graph.put("B",Arrays.asList("C"));
        graph.put("C",Arrays.asList("A"));

        boolean cycle=dfs("A",graph,new HashSet<>(),new HashSet<>());

        System.out.println("Cycle Found : "+cycle);
    }
}