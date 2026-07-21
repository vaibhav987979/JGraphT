import org.jgrapht.graph.*;
import org.jgrapht.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Graph<Person, DefaultEdge> graph =
                new SimpleGraph<>(DefaultEdge.class);

        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        graph.addVertex(p1);
        graph.addVertex(p2);

        graph.addEdge(p1, p2);

        System.out.println(graph);
    }
}