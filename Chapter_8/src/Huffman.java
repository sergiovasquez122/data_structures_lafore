/**
 * Construct a huffman tree
 */
public class Huffman {
    private static class Node implements Comparable<Node>{
        private char ch;
        private int freq;
        private final Node left, right;

        public Node(char ch, int freq, Node left, Node right){
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node that) {
            return Integer.compare(freq, that.freq);
        }

        public boolean isLeaf(){
            return left == null && right == null;
        }
    }
}
