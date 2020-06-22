import edu.princeton.cs.algs4.StdIn;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(50, 1.5);
        tree.insert(25, 1.7);
        tree.insert(75, 1.9);
        tree.insert(12, 1.5);
        tree.insert(37, 1.2);
        tree.insert(43, 1.7);
        tree.insert(30, 1.5);
        tree.insert(87, 1.7);
        tree.insert(93, 1.5);
        tree.insert(93, 1.5);
        tree.insert(97, 1.5);

        while(true){
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse: ");
            int choice = StdIn.readChar();
            switch (choice){
                case 's':
                    tree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    int value = StdIn.readInt();
                    tree.insert(value, 0.9 + value);
                    break;
                case 'f':
                    System.out.print("Enter value + find: ");
                    value = StdIn.readInt();
                    Node found = tree.find(value);
                    if(found != null){
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.print("Could not find");
                        System.out.print(value + "\n");
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = StdIn.readInt();
                    tree.delete(value);
                    break;
                case 't':
                    System.out.print("Enter tyep 1, 2, or 3: ");
                    value = StdIn.readInt();
                    tree.traverse(value);
                    break;

            }
        }
    }
}
