import edu.princeton.cs.algs4.StdIn;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * problem 6.5 Implement a recursive approach
 * to showing all the teams that can be created
 * from a group.
 */
public class Combinations {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = StdIn.readInt();
        System.out.print("Enter k: ");
        int k = StdIn.readInt();
        System.out.println(combinations(n, k));
    }

    private static void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> partial, int n, int k, int begin){
        if(k == 0){
            result.add(new ArrayList<>(partial));
        } else {
            for(int i = begin + 1;i <=n;++i){
                partial.add(i);
                helper(result, partial, n, k - 1, i);
                partial.remove(partial.size() - 1);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> combinations(int n, int k){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> partial = new ArrayList<>();
        helper(result, partial, n, k, 0);
        return result;
    }
}
