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
            current.bottomlink = new Node();
            current = current.bottomlink;
        }
    }

    public void updateValue(int m, int n, int value){
        Node current = upperleft;
        for(int i = 0;i < m;++i) current = current.bottomlink;
        for(int i = 0;i< n;++i) current = current.rightlink;
        current.value = value;
    }

    public void displayMatrix(){
        Node current_row = upperleft;
        for(int i = 0;i < rows;++i){
            Node current_col = current_row;
            for(int j = 0;j < cols;++j){
                System.out.print(current_col.value + " ");
                current_col = current_col.rightlink;
            }
            System.out.println();
            current_row = current_row.bottomlink;
        }
    }

    public int rows(){
        return rows;
    }

    public int cols(){
        return cols;
    }

    public int getValue(int m, int n){
        Node current = upperleft;
        for(int i = 0;i < m;++i) current = current.bottomlink;
        for(int i = 0;i < n;++i) current = current.rightlink;
        return current.value;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(5,5);
        matrix.displayMatrix();
        System.out.println();

        for(int i = 0; i < 5;++i){
            for(int j = 0;j < 5;++j){
                matrix.updateValue(i, j, i - j);
            }
        }
        matrix.displayMatrix();
    }
}
