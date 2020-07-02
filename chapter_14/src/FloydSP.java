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
    }
}
