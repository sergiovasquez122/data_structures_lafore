/**
 * Exercise 14.1 print a table of the minimum costs to get from any vertex to any other vertex
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
               sb.append(String.format("%.2f%4s", table[i][j] == Double.POSITIVE_INFINITY ? -1.0 : table[i][j], ""));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(5);
        G.addEdge(new DirectedEdge(0, 1, 50));
        G.addEdge(new DirectedEdge(0, 3, 80));
        G.addEdge(new DirectedEdge(1, 2, 60));
        G.addEdge(new DirectedEdge(1, 3, 90));
        G.addEdge(new DirectedEdge(2, 4, 40));
        G.addEdge(new DirectedEdge(3, 2, 20));
        G.addEdge(new DirectedEdge(3, 4, 70));
        G.addEdge(new DirectedEdge(4, 1, 50));

        DistanceTable tbl = new DistanceTable(G);
        System.out.println(tbl);
    }
}
