import edu.princeton.cs.algs4.Bag;

public class Graph {
    private double adjMat[][];
    private final int V;
    private int E;

    public Graph(int V){
        this.V = V;
        adjMat = new double[V][V];

        for(int i = 0;i < V;++i)
            for(int j = 0;j < V;++j)
                adjMat[i][j] = Double.POSITIVE_INFINITY;
    }

    public void addEdge(int v, int w, double weight){
        adjMat[v][w] = weight;
        adjMat[w][v] = weight;
        E++;
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public double weight(int v, int w){
        return adjMat[v][w];
    }

    public Iterable<Integer> edgeTo(int v){
        Bag<Integer> bag = new Bag<>();
        for(int i = 0;i < V;++i) {
            if (adjMat[v][i] < Double.POSITIVE_INFINITY) {
                bag.add(i);
            }
        }
        return bag;
    }
}
