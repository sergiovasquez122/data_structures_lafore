import edu.princeton.cs.algs4.Bag;
import java.util.ArrayList;

/**
 * implement the traveling salesman problem
 */
public class TSP {
    private double weight;

    public TSP(Graph G){
        weight = Double.POSITIVE_INFINITY;
        int[] path = new int[G.V()];
        for(int i = 0;i < G.V();++i)
            path[i] = i;
        ArrayList<ArrayList<Integer>> result = generatePermutation(path);
        for(ArrayList<Integer>  current_path: result){
            double running_sum = 0;
            for(int i = 1;i < current_path.size();++i){
                running_sum += G.weight(current_path.get(i - 1), current_path.get(i));
            }
            running_sum += G.weight(current_path.get(current_path.size() - 1), current_path.get(0));
            weight = Double.min(weight, running_sum);
        }
    }

    private void permute(ArrayList<ArrayList<Integer>> result,int[] a, int begin){
        if(begin == a.length - 1){
            ArrayList<Integer> partial = new ArrayList<>();
            for(int e : a) partial.add(e);
            result.add(partial);
        } else {
            for(int i = begin;i < a.length;++i){
                swap(a, begin, i);
                permute(result, a, begin + 1);
                swap(a, begin, i);
            }
        }
    }

    private ArrayList<ArrayList<Integer>> generatePermutation(int[] a){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permute(result, a, 0);
        return result;
    }

    private void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public boolean hasPath(){
        return weight < Double.POSITIVE_INFINITY;
    }

    public double weight(){
        return weight;
    }

    public static void main(String[] args) {
        Graph G = new Graph(5);
        G.addEdge(0, 1, 91);
        G.addEdge(0, 2, 62);
        G.addEdge(0, 3, 55);
        G.addEdge(1, 2, 44);
        G.addEdge(1, 4, 31);
        G.addEdge(2, 3, 52);
        G.addEdge(2, 4, 45);
        TSP tsp = new TSP(G);
        System.out.println(tsp.weight());
    }
}
