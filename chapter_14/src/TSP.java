/**
 * implement the traveling salesman problem
 */
public class TSP {
    private double distTo[][];
    private double weight;

    public boolean hasPath(){
        return weight < Double.POSITIVE_INFINITY;
    }

    public double weight(){
        return weight;
    }
}
