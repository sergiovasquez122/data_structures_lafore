/**
 * Implement floyd-shortest path algorithm
 */
public class FloydSP {
    private double[][] distTo;

    public FloydSP(Graph G){
        distTo = new double[G.V()][G.V()];
        for(int i = 0;i < G.V();++i)
            for(int j = 0;j < G.V();++j)
                distTo[i][j] = Double.POSITIVE_INFINITY;

        for(int i = 0;i < G.V();++i){
            for(int j = 0;j < G.V();++j){
                if(G.hasPath(i, j)){
                    for(int k = 0;k < G.V();++k){
                        if(G.hasPath(k, i)){
                            distTo[k][j] = Double.min(distTo[k][j],distTo[k][i] + distTo[i][j]);
                        }
                    }
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
}
