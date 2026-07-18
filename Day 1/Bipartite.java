package Advance;

import java.util.*;

public class Bipartite {

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=new HashMap<>();

        graph.put(0,Arrays.asList(1,3));
        graph.put(1,Arrays.asList(0,2));
        graph.put(2,Arrays.asList(1,3));
        graph.put(3,Arrays.asList(0,2));

        Map<Integer,Integer> color=new HashMap<>();

        Queue<Integer> queue=new LinkedList<>();

        queue.add(0);
        color.put(0,0);

        boolean bipartite=true;

        while(!queue.isEmpty()){

            int node=queue.poll();

            for(int neighbour:graph.get(node)){

                if(!color.containsKey(neighbour)){

                    color.put(neighbour,1-color.get(node));
                    queue.add(neighbour);

                }else if(color.get(neighbour).equals(color.get(node))){

                    bipartite=false;
                }
            }
        }

        System.out.println("Graph is Bipartite : "+bipartite);
    }
}
