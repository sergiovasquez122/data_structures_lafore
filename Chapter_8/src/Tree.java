import edu.princeton.cs.algs4.Stack;

public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while(current != null){
            if(current.iData < key){
                current = current.right;
            } else if(current.iData > key){
                current = current.left;
            } else {
                return current;
            }
        }
        return null;
    }

    public void insert(int id, double dd){
        root = insert(root, id, dd);
    }

    private Node insert(Node current, int id, double dd){
        if(current == null){
            current = new Node();
            current.iData = id;
            current.dData = dd;
            return current;
        }

        if(current.iData < id) current.right = insert(current.right, id, dd);
        else if(current.iData > id) current.left = insert(current.left, id, dd);
        return current;
    }

    public Node min(Node root){
        Node iter = root;
        while(iter.left != null){
            iter = iter.left;
        }
        return iter;
    }

    public Node max(Node root){
        Node iter = root;
        while(iter.right != null){
            iter = iter.right;
        }
        return iter;
    }

    public void traverse(int traverseType){
        switch (traverseType){
            case 1: System.out.println("\nPreorder traversal: ");
            preOrder(root);
            break;
            case 2: System.out.print("\nInorder traversal: ");
            inOrder(root);
            break;
            case 3: System.out.println("\nPostorder traversal: ");
            postOrder(root);
            break;
        }
        System.out.println();
    }

    private void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.dData + " ");
        inOrder(root.right);

    }

    private void preOrder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.iData + " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    private void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.iData + " ");
    }

    public void deleteMin(){
        root = deleteMin(root);
    }

    private Node deleteMin(Node x){
        if(x.left == null) return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    public void deleteMax(){
        root = deleteMax(root);
    }

    public void delete(int value){
        root = delete(root, value);
    }

    public Node delete(Node x, int value){
        if(x == null) return null;
        if(x.iData < value) x.right = delete(x.right, value);
        else if(x.iData > value) x.left = delete(x.left, value);
        else{
            if(x.left == null) return x.right;
            if(x.right == null) return x.left;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        return x;
    }

    private Node deleteMax(Node x){
        if(x.right == null) return x.left;
        x.right = deleteMax(x.right);
        return x;
    }

    public void displayTree(){
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        while(!isRowEmpty){
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for(int j = 0;j < nBlanks;++j){
                System.out.print(' ');
            }

            while(!globalStack.isEmpty()){
                Node temp = globalStack.pop();
                if(temp != null){
                    System.out.print(temp.iData);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    isRowEmpty = !(temp.left != null || temp.right != null);
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j = 0;j < nBlanks * 2 - 2;++j)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while(!localStack.isEmpty()) globalStack.push(localStack.pop());
        }
        System.out.println("......................................................");
    }
}
