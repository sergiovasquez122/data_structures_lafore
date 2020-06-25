import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdIn;

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

        @Override
        public int compareTo(Node that) {
            return freq - that.freq;
        }

        public boolean isLeaf(){
            return left == null && right == null;
        }
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
            pq.insert(new Node('\0', x.freq + y.freq, x, y));
        }
        return pq.delMin();
    }

    public static void main(String[] args) {
        System.out.print("Enter a message: ");
        String input = StdIn.readString();

        int[] freq = new int[R];

        for(int i = 0;i < input.length();++i){
            freq[input.charAt(i)]++;
        }

        Node root = buildTrie(freq);
        String[] st = new String[R];
        buildCode(st, root, "");

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < input.length();++i){
            String code = st[input.charAt(i)];
            sb.append(code);
        }
        String encoded = sb.toString();
        System.out.println(encoded);

        sb = new StringBuilder();
        int idx = 0;
        while(idx < encoded.length()){
            Node x = root;
            while(!x.isLeaf()){
                if(encoded.charAt(idx) == '0'){
                    x = x.left;
                } else {
                    x = x.right;
                }
                idx++;
            }
            sb.append(x.ch);
        }
        String decoded = sb.toString();
        System.out.println(decoded);
    }

    public static void buildCode(String[] st, Node x, String s){
        if(x.isLeaf()){
            st[x.ch] = s;
            return;
        }
        buildCode(st, x.left, s + '0');
        buildCode(st, x.right, s + '1');
    }

}
