import java.util.ArrayList;

/**
 * problem 6.2
 * Draw a binary tree using recursion
 */
public class TreeApp {
    public static void main(String[] args) {
        treeDrawer(0, 15);
    }

    public static void treeDrawer(int low, int hi){
        if(low < hi){
            ArrayList<Character> values = new ArrayList<>();
            int mid = (low + hi) / 2;
            for(int i = low;i < hi;++i){
                if(i == mid){
                    values.add('x');
                } else {
                    values.add('-');
                }
            }
            System.out.println(values);
            treeDrawer(low, mid);
            treeDrawer(mid + 1, hi);
        }
    }
}
