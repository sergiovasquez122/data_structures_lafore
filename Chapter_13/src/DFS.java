/**
 * question 13.2 implement dfs using an adjacency list representation
 */
public class DFS {

    private boolean marked[];

    public DFS(Digraph G, int s){
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    public void dfs(Digraph G, int v){
        marked[v] = true;
        for(int w : G.adj(v)){
            if(!marked[w])dfs(G, w);
        }
    }

    public boolean marked(int v){
        return marked[v];
    }

    public static void main(String[] args) {
        Digraph digraph = new Digraph(5);
        digraph.addEdge(0, 1);
        digraph.addEdge(1, 2);
        digraph.addEdge(0, 3);
        digraph.addEdge(3, 4);

        DFS dfs = new DFS(digraph, 0);
        for(int i = 0;i < digraph.V();++i)
            if(dfs.marked[i]) System.out.print(i + " ");
    }
}
