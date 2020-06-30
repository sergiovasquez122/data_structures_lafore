import edu.princeton.cs.algs4.Queue;

/**
 * programming exercise 12.5 implement the knight tour
 */
public class KnightTour {
    private boolean marked[][];
    private Queue<Edge> tour;
    private boolean tourExists;
    public KnightTour(int N, int x, int y){
        tour = new Queue<>();
        marked = new boolean[N][N];
        tourExists = tour(marked, tour, new Edge(x, y));
    }

    public boolean tourExist(){
        return tourExists;
    }

    private boolean tour(boolean marked[][], Queue<Edge> tour, Edge e){
        if(!feasible(marked, e)) return false;
        tour.enqueue(e);
        if(tour.size() == marked.length * marked.length){
            return true;
        }
        marked[e.getX()][e.getY()] = true;

        int positions[][] = {{2, 1}, {2, -1}, {1, 2}, {1, -2}, {-2, 1}, {-2, -1}, {-1, 2}, {-1, -2}};
        for(int[] pos : positions){
            int new_x = pos[0] + e.getX();
            int new_y = pos[1] + e.getY();
            if(tour(marked, tour, new Edge(new_x, new_y))){
                return true;
            }
        }
        marked[e.getX()][e.getY()] = false;
        return false;
    }

    private boolean feasible(boolean marked[][], Edge e){
        return e.getX() >= 0 && e.getX() < marked.length && e.getY() >= 0 && e.getY() < marked[e.getX()].length && !marked[e.getX()][e.getY()];
    }

    public Iterable<Edge> getTour(){
        return tour;
    }

    public static void main(String[] args) {
        KnightTour knightTour = new KnightTour(5, 0, 0);
        if(knightTour.tourExist()) {
            for (Edge e : knightTour.getTour()) {
                System.out.print("(" + e.getX() + "," + e.getY() + ") ");
            }
        }
        System.out.println();
    }
}
