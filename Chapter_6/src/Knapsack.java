import java.lang.reflect.Array;
import java.util.ArrayList;

public class Knapsack {
    public static void main(String[] args) {
        ArrayList<Integer> knapsack = new ArrayList<>();
        knapsack.add(11);
        knapsack.add(8);
        knapsack.add(7);
        knapsack.add(6);
        knapsack.add(5);
        System.out.println(solver(knapsack, 20));
    }

    public static ArrayList<Integer> solver(ArrayList<Integer> values, int target){
        ArrayList<Integer> result = new ArrayList<>();
        if(helper(result, values, target, 0)){
            return result;
        }
        return null;
    }

    public static boolean helper(ArrayList<Integer> result, ArrayList<Integer> values, int target, int begin){
        if(target == 0){
            return true;
        } else if(target < 0){
            return false;
        }
        else {
            for(int i = begin + 1;i < values.size();++i){
                result.add(values.get(i));
                if(helper(result, values, target - values.get(i), i)){
                    return true;
                }
                result.remove(result.size() - 1);
            }
            return false;
        }
    }
}

