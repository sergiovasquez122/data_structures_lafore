/**
 * implement the traveling salesman problem
 */
public class TSP {
    private double weight;

    public TSP(Graph G){
        weight = Double.POSITIVE_INFINITY;
    }

    public boolean hasPath(){
        return weight < Double.POSITIVE_INFINITY;
    }

    public double weight(){
        return weight;
    }
}
