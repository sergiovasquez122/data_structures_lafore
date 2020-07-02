import edu.princeton.cs.algs4.Bag;

public class DirectedGraph {
    private double adjMat[][];
    private final int V;
    private int E;

    public DirectedGraph(int V){
        this.V = V;
        adjMat = new double[V][V];

        for(int i = 0;i < V;++i)
            for(int j = 0;j < V;++j)
                adjMat[i][j] = i == j ? 0 : Double.POSITIVE_INFINITY;
    }

    public void addEdge(int v, int w, double weight){
        adjMat[v][w] = weight;
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < adjMat.length;++i){
            for(int j = 0;j < adjMat.length;++j){
                sb.append(String.format("%.2f%4s", adjMat[i][j] == Double.POSITIVE_INFINITY ? -1.0 : adjMat[i][j], ""));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean hasPath(int v, int w){
        return adjMat[v][w] < Double.POSITIVE_INFINITY;
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
