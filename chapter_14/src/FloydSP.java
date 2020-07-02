import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Implement floyd-shortest path algorithm
 */
public class FloydSP {
    private double[][] distTo;

    public FloydSP(Graph G){
        distTo = new double[G.V()][G.V()];
        for(int i = 0;i < G.V();++i)
            for(int j = 0;j < G.V();++j)
                distTo[i][j] = G.weight(i, j);

        for(int i = 0;i < G.V();++i){
            for(int j = 0;j < G.V();++j){
                    for(int k = 0;k < G.V();++k){
                        distTo[k][j] = Double.min(distTo[k][j],distTo[k][i]+ distTo[i][j]);
                }
            }
        }
    }

    public boolean hasPath(int v, int w){
        return distTo[v][w] < Double.POSITIVE_INFINITY;
    }

    public double distTo(int v, int w){
        return distTo[v][w];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < distTo.length;++i){
            for(int j = 0;j < distTo.length;++j){
                sb.append(String.format("%.2f%4s", distTo[i][j] == Double.POSITIVE_INFINITY ? -1.0 : distTo[i][j], ""));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph G = new Graph(5);
        G.addEdge(0, 1, 1);
        G.addEdge(0, 2, 3);
        G.addEdge(0, 3, 1);
        G.addEdge(0, 4, 4);
        G.addEdge(1, 0, 8);
        G.addEdge(1, 2, 3);
        G.addEdge(1, 3, 2);
        G.addEdge(1, 4, 5);
        G.addEdge(2, 0, 10);
        G.addEdge(2, 1, 11);
        G.addEdge(2, 3, 4);
        G.addEdge(2, 4, 7);
        G.addEdge(3, 0, 6);
        G.addEdge(3, 1, 7);
        G.addEdge(3, 2, 2);
        G.addEdge(3, 4, 5);
        G.addEdge(4, 0, 3);
        G.addEdge(4, 1, 4);
        G.addEdge(4, 2, 6);
        G.addEdge(4, 3, 4);
        FloydSP floydSP = new FloydSP(G);
        System.out.println(floydSP);
    }
}
