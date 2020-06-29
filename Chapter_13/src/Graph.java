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



    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }
}
