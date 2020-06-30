import edu.princeton.cs.algs4.Bag;

public class Digraph {
    private final int V;
    private int E;
    private Bag<Integer> adj[];

    public Digraph(int v){
        this.V = v;
        this.E = 0;

        adj = (Bag<Integer>[]) new Bag[V];
        for(int i = 0;i < V;++i)
            adj[i] = new Bag<>();
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}
