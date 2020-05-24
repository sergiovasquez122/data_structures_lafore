/**
 * Exercise 5.6 Implement a matrix using a linked list
 */
public class Matrix {
    private class Node{
        private int value;
        private Node bottomlink;
        private Node rightlink;

        private Node(){value = 0;}
    }

    private int rows;
    private int cols;
    private Node upperleft;

    public Matrix(int m, int n){
        this.rows = m;
        this.cols = n;
        upperleft = new Node();
        Node current = upperleft;

        for(int i = 0;i < rows;++i){
            Node col = current;
            for(int j = 0;j < cols;++j){
                col.rightlink = new Node();
                col = col.rightlink;
            }
            Node newRow = new Node();
            current.bottomlink = newRow;
            current = newRow;
        }
    }

    public void updateValue(int m, int n, int value){
        Node current = upperleft;
        for(int i = 0;i < m;++i) current = current.bottomlink;
        for(int i = 0;i< n;++i) current = current.rightlink;
        current.value = value;
    }

    public void displayMatrix(){
        for(int i = 0;i < rows;++i){
            for(int j = 0;j < cols;++j){

            }
        }
    }

    public int rows(){
        return rows;
    }

    public int cols(){
        return cols;
    }
}
