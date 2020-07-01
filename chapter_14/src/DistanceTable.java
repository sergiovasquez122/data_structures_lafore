/**
 * Exercise 14.1 print a table of the minimum costs to get from any vertext to any other vertex
 */
public class DistanceTable {
    private double[][] table;
    public DistanceTable(EdgeWeightedDigraph G){
        DijkstraSP[] shortestPaths = new DijkstraSP[G.V()];
        table = new double[G.V()][G.V()];
        for(int i = 0;i < G.V();++i)
            shortestPaths[i] = new DijkstraSP(G, i);

        for(int i = 0;i < G.V();++i){
            for(int j = 0;j < G.V();++j){
                table[i][j] = shortestPaths[i].distTo(j);
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < table.length;++i){
            for(int j = 0;j < table.length;++j){
                sb.append(table[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }

}
