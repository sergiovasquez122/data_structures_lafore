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

    public void moveRowUp(int row, int length){
        for(int col = 0;col < length;++col)
            adjMat[row][col] = adjMat[row + 1][col];
    }
}
