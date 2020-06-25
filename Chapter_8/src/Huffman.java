import edu.princeton.cs.algs4.MinPQ;

/**
 * Construct a huffman tree
 */
public class Huffman {
    private static int R = 256;
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

        private static Node buildTrie(int[] freq){
            MinPQ<Node> pq = new MinPQ<>();
            for(char c = 0;c < R;c++){
                if(freq[c] > 0){
                    pq.insert(new Node(c, freq[c], null, null));
                }
            }
            while(pq.size() > 1){
                Node x = pq.delMin();
                Node y = pq.delMin();
                pq.insert(new Node('\0', x.freq + x.freq, x, y));
            }
            return pq.delMin();
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
