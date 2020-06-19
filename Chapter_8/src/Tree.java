public class Tree {
    private Node root;

    private Node find(int key){
        Node iter = root;
        while(iter != null){
            if(iter.iData < key){
                iter = iter.right;
            } else if (iter.iData > key){
                iter = iter.left;
            } else {
                return iter;
            }
        }
        return null;
    }

    public void insert(int id, double dd){
        root = helper(root, id, dd);
    }

    public void inOrder(Node current){
        if(current == null){
            return;
        }

        inOrder(current.left);
        System.out.println(current.iData + " ");
        inOrder(current.right);
    }

    public void preOrder(Node current){
        if(current == null){
            return;
        }

        System.out.println(current.iData + " ");
        preOrder(current.left);
        preOrder(current.right);
    }

    public void postOrder(Node current){
        if(current == null){
            return;
        }

        postOrder(current.left);
        postOrder(current.right);
        System.out.println(current.iData + " ");
    }

    public Node helper(Node current, int id, double dd){
        if(current == null){
           Node newNode = new Node();
           newNode.iData = id;
           newNode.dData = id;
           return newNode;
        }

        if(current.iData < id) current.right = helper(current.right, id, dd);
        else if(current.iData > id) current.left = helper(current.left, id, dd);
        return current;
    }

    public void delete(int id){

    }
}
