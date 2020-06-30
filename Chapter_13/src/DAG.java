public class DAG {
    private final int MAX_VERTS =20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private char sortedArray[];

    public DAG(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        sortedArray = new char[MAX_VERTS];
    }

    public void topo(){
        int orig_nVerts = nVerts;

        while(nVerts > 0){
            int currentVertex = noSuccessors();
            if(currentVertex == -1){
                System.out.println("ERROR: Graph has cycles");
                return;
            }
            sortedArray[nVerts - 1] = vertexList[currentVertex].label;
            deleteVertex(currentVertex);
        }
        System.out.print("Topologically sorted order: ");
        for(int i = 0;i < orig_nVerts;++i)
            System.out.print(sortedArray[i]);
        System.out.println();
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public int noSuccessors(){
        for(int row = 0;row < nVerts;++row){
            boolean isEdge = false;
            for(int col = 0;col < nVerts;++col){
                isEdge = adjMat[row][col] > 0;
            }
            if(!isEdge){
                return row;
            }
        }
        return -1;
    }

    public void deleteVertex(int delVert){
        if(delVert != nVerts - 1){
           for(int i = delVert;i < nVerts - 1;i++)
               vertexList[i] = vertexList[i + 1];

           for(int row = delVert;row < nVerts -1;row++)
               moveRowUp(row, nVerts);

           for(int col = delVert;col < nVerts - 1;col++)
               moveColLeft(col, nVerts - 1);
        }
        nVerts--;
    }

    public void moveRowUp(int row, int length){
        for(int col = 0;col < length;++col)
            adjMat[row][col] = adjMat[row + 1][col];
    }

    public void moveColLeft(int col, int length){
        for(int row = 0;row < length;++row)
            adjMat[row][col] = adjMat[row][col + 1];
    }

    public static void main(String[] args) {
        DAG dag = new DAG();
        dag.addVertex('A');
        dag.addVertex('B');
        dag.addVertex('C');
        dag.addVertex('D');
        dag.addVertex('E');
        dag.addVertex('F');
        dag.addVertex('G');
        dag.addVertex('H');
        dag.addEdge(0, 3);
        dag.addEdge(0, 4);
        dag.addEdge(1, 4);
        dag.addEdge(2, 5);
        dag.addEdge(3, 6);
        dag.addEdge(4, 6);
        dag.addEdge(5, 7);
        dag.addEdge(6, 7);
        dag.topo();
    }
}
