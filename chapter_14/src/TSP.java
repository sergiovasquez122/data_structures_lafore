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
        System.out.println(result);
    }

    public void permute(ArrayList<ArrayList<Integer>> result,int[] a, int begin){
        if(begin == a.length){
            ArrayList<Integer> partial = new ArrayList<>();
            for(int e : a) partial.add(e);
            result.add(partial);
        } else {
            for(int i = begin;i < a.length;++i){
                swap(a, i, i + 1);
                permute(result, a, i + 1);
                swap(a, i, i + 1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> generatePermutation(int[] a){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permute(result, a, 0);
        return result;
    }

    public void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = j;
        a[j] = i;
    }

    public boolean hasPath(){
        return weight < Double.POSITIVE_INFINITY;
    }

    public double weight(){
        return weight;
    }
}
