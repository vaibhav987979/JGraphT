package Basic;
public class AdjacencyMatrix {

    int[][] matrix;

    AdjacencyMatrix(int n){
        matrix=new int[n][n];
    }

    void addEdge(int u,int v){
        matrix[u][v]=1;
        matrix[v][u]=1;
    }

    boolean hasEdge(int u,int v){
        return matrix[u][v]==1;
    }

    public static void main(String[] args){

        AdjacencyMatrix g=new AdjacencyMatrix(4);

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);

        System.out.println(g.hasEdge(0,3));
    }
}