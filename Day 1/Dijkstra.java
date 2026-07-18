package Advance;

import java.util.*;

public class Dijkstra {

    static class Node{

        String city;
        int distance;

        Node(String city,int distance){
            this.city=city;
            this.distance=distance;
        }
    }

    static Map<String,List<Node>> graph=new HashMap<>();

    static void addEdge(String u,String v,int w){

        graph.putIfAbsent(u,new ArrayList<>());
        graph.putIfAbsent(v,new ArrayList<>());

        graph.get(u).add(new Node(v,w));
        graph.get(v).add(new Node(u,w));
    }

    public static void main(String[] args){

        addEdge("Kolkata","Bhubaneswar",440);
        addEdge("Bhubaneswar","Chennai",1030);
        addEdge("Kolkata","Ranchi",410);
        addEdge("Ranchi","Chennai",1650);

        PriorityQueue<Node> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.distance));

        Map<String,Integer> dist=new HashMap<>();

        dist.put("Kolkata",0);

        pq.add(new Node("Kolkata",0));

        while(!pq.isEmpty()){

            Node current=pq.poll();

            for(Node next:graph.get(current.city)){

                int newDistance=current.distance+next.distance;

                if(newDistance<dist.getOrDefault(next.city,Integer.MAX_VALUE)){

                    dist.put(next.city,newDistance);
                    pq.add(new Node(next.city,newDistance));
                }
            }
        }

        System.out.println(dist.get("Chennai")+" km");
    }
}
