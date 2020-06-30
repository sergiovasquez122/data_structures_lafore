public class ConnectivityTable {
    private DFS depthFirstSearches[];

    public ConnectivityTable(Digraph G){
        depthFirstSearches = new DFS[G.V()];
        for(int i = 0;i < G.V(); ++i)
            depthFirstSearches[i] = new DFS(G, i);
    }

    public void display(){
        for(DFS dfs : depthFirstSearches)
            dfs.display();
    }

    public static void main(String[] args) {
       Digraph G = new Digraph(5);
       G.addEdge(1, 0);
       G.addEdge(0, 2);
       G.addEdge(1, 4);
       G.addEdge(3, 4);
       G.addEdge(4, 2);
       ConnectivityTable ct = new ConnectivityTable(G);
       ct.display();
    }
}
