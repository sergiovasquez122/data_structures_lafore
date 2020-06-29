import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public int getAdjUnvisitedVertex(int v){
        for(int i = 0;i < nVerts;++i){
            if(adjMat[v][i] == 1 && !vertexList[i].wasVisited){
               return i;
            }
        }
        return -1;
    }

    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        Stack<Integer> on_stack = new Stack<>();
        on_stack.push(0);

        while(!on_stack.isEmpty()){
            int v = getAdjUnvisitedVertex(on_stack.peek());
            if(v == -1)
                on_stack.pop();
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                on_stack.push(v);
            }
        }

        for(int i = 0;i < nVerts;++i)
            vertexList[i].wasVisited = false;
    }

    public void bfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        Queue<Integer> on_queue = new Queue<>();
        on_queue.enqueue(0);

        while(!on_queue.isEmpty()){
            int v = getAdjUnvisitedVertex(on_queue.peek());
            if(v == -1)
                on_queue.dequeue();
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                on_queue.enqueue(v);
            }
        }
        for(int i = 0;i < nVerts;++i)
            vertexList[i].wasVisited = false;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);

        System.out.print("Visits: ");
        theGraph.dfs();
        System.out.println();

        System.out.print("Visits: ");
        theGraph.bfs();
        System.out.println();
    }
}
