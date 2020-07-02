import java.util.ArrayList;

/**
 * problem 14.5 write a program that discovers and displays all the hamiltonian cycles
 * of a weighted, non-directed graph
 */
public class HC {

    public HC(Graph G){
        ArrayList<ArrayList<Integer>> cycles = new ArrayList<ArrayList<Integer>>();
        int[] path = new int[G.V()];
        for(int i = 0;i < G.V();++i)
            path[i] = i;
        ArrayList<ArrayList<Integer>> perms = generatePermutation(path);
        for(ArrayList<Integer> current_path : perms){
            boolean validCycle = true;
            for(int i = 1;i < current_path.size();++i){
                int v = current_path.get(i - 1);
                int w = current_path.get(i);
                validCycle = validCycle && G.hasPath(v, w);
            }
            validCycle = validCycle && G.hasPath(current_path.get(current_path.size() - 1), current_path.get(0));
            if(validCycle){
                current_path.add(current_path.get(0));
                cycles.add(current_path);
            }
        }
        System.out.println(cycles);
    }

    private void permute(ArrayList<ArrayList<Integer>> result,int[] a, int begin){
        if(begin == a.length - 1){
            ArrayList<Integer> partial = new ArrayList<>();
            for(int e : a) partial.add(e);
            result.add(partial);
        } else {
            for(int i = begin;i < a.length;++i){
                swap(a, begin, i);
                permute(result, a, i + 1);
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

    public static void main(String[] args) {
        Graph G = new Graph(5);
        G.addEdge(0, 1, 91);
        G.addEdge(0, 2, 62);
        G.addEdge(0, 3, 55);
        G.addEdge(1, 2, 44);
        G.addEdge(1, 4, 31);
        G.addEdge(2, 3, 52);
        G.addEdge(2, 4, 45);
        HC hc = new HC(G);
    }
}
