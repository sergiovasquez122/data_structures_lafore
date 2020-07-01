import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Queue;

public class LazyPrimMST {
    private boolean[] marked;
    private Queue<Edge> mst;
    private MinPQ<Edge> pq;
    private double weight;

    public LazyPrimMST(EdgeWeightedGraph G){
        marked = new boolean[G.V()];
        pq = new MinPQ<>();
        mst = new Queue<>();
        weight = 0;

        visit(G, 0);
        while(!pq.isEmpty()){
            Edge e = pq.delMin();
            int v = e.either(), w = e.other(v);
            if(marked[v] && marked[w]) continue;
            mst.enqueue(e);
            weight += e.weight();
            if(!marked[v]) visit(G, v);
            if(!marked[w]) visit(G, w);
        }
    }

    private void visit(EdgeWeightedGraph G, int v){
        marked[v] = true;
        for(Edge e : G.adj(v))
            if(!marked[e.other(v)]) pq.insert(e);
    }

    public Iterable<Edge> edges(){
        return mst;
    }

    public double weight(){
        return weight;
    }
}
