import edu.princeton.cs.algs4.Queue;

import java.util.ArrayList;

/**
 * programming exercise 12.5 implement the knight tour
 */
public class KnightTour {
    private boolean marked[][];
    private ArrayList<Edge> tour;
    private boolean tourExists;
    private int N;
    public KnightTour(int N, int x, int y){
        this.N = N;
        tour = new ArrayList<>();
        marked = new boolean[N][N];
        tourExists = tour(marked, tour, new Edge(x, y));
    }

    public boolean tourExist(){
        return tourExists;
    }

    private boolean tour(boolean marked[][], ArrayList<Edge> tour, Edge e){
        if(!feasible(marked, e)) return false;
        tour.add(e);
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
        tour.remove(tour.size() - 1);
        marked[e.getX()][e.getY()] = false;
        return false;
    }

    private boolean feasible(boolean marked[][], Edge e){
        return e.getX() >= 0 && e.getX() < marked.length && e.getY() >= 0 && e.getY() < marked[e.getX()].length && !marked[e.getX()][e.getY()];
    }

    public Iterable<Edge> getTour(){
        return tour;
    }

    public void displayMovements(){
        int movements[][] = new int[N][N];
        int counter = 1;
        if(tourExist()){
            for(Edge e : getTour()){
                movements[e.getX()][e.getY()] = counter++;
            }
        }

        for(int i = 0;i < N; ++i){
            for(int j = 0;j < N;++j){
                System.out.print(movements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        KnightTour knightTour = new KnightTour(5, 0, 0);
        if(knightTour.tourExist()) {
            for (Edge e : knightTour.getTour()) {
                System.out.print("(" + e.getX() + "," + e.getY() + ") ");
            }
        }
        System.out.println();

        knightTour.displayMovements();
    }
}
