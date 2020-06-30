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
            int v1 = on_queue.dequeue();
            int v2;
            while((v2 = getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                on_queue.enqueue(v2);
            }
        }

        for(int i = 0;i < nVerts;++i){
            vertexList[i].wasVisited = false;
        }
    }

    public void mst(){
        vertexList[0].wasVisited = true;
        Stack<Integer> on_stack = new Stack<>();
        on_stack.push(0);
        while(!on_stack.isEmpty()){
            int v = getAdjUnvisitedVertex(on_stack.peek());
            if(v == -1) on_stack.pop();
            else{
                int current_vertex = on_stack.peek();
                displayVertex(current_vertex);
                displayVertex(v);
                System.out.print(" ");
                on_stack.push(v);
                vertexList[v].wasVisited = true;
            }
        }
        for(int i = 0;i < nVerts;++i){
            vertexList[i].wasVisited = false;
        }
    }

    public void mst_bst(){
        vertexList[0].wasVisited = true;
        Queue<Integer> on_queue = new Queue<>();
        on_queue.enqueue(0);
        while(!on_queue.isEmpty()){
            int v1 = on_queue.dequeue();
            int v2;
            while((v2 = getAdjUnvisitedVertex(v1)) != -1){
                displayVertex(v1);
                displayVertex(v2);
                System.out.print(" ");
                vertexList[v2].wasVisited = true;
                on_queue.enqueue(v2);
            }
        }
        for(int i = 0;i < nVerts;++i){
            vertexList[i].wasVisited = false;
        }
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public void floydWarshall(){
        for(int y = 0;y < nVerts;++y){
            for(int x = 0;x < nVerts;++x){
                if(adjMat[y][x] == 1){
                    for(int z = 0;z < 20;++z){
                        if(adjMat[z][y] == 1){
                            adjMat[z][x] = 1;
                        }
                    }
                }
            }
        }
    }

    public void displayAdj(){
        for(int i = 0;i < nVerts;++i){
            for(int j = 0;j < nVerts;++j){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
    }
}
