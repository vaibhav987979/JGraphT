package Advance;

import java.util.*;

public class DegreesOfSeparation {

    public static void main(String[] args){

        Map<String,List<String>> graph=new HashMap<>();

        graph.put("You",Arrays.asList("Ravi","Meera"));
        graph.put("Ravi",Arrays.asList("You","Anjali"));
        graph.put("Meera",Arrays.asList("You"));
        graph.put("Anjali",Arrays.asList("Ravi","CEO"));
        graph.put("CEO",Arrays.asList("Anjali"));

        Queue<String> queue=new LinkedList<>();
        Map<String,Integer> distance=new HashMap<>();

        queue.add("You");
        distance.put("You",0);

        while(!queue.isEmpty()){

            String current=queue.poll();

            for(String next:graph.get(current)){

                if(!distance.containsKey(next)){

                    distance.put(next,distance.get(current)+1);
                    queue.add(next);
                }
            }
        }

        System.out.println("Degrees = "+distance.get("CEO"));
    }
}