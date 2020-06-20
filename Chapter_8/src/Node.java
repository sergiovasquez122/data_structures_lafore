public class Node {
    public int iData;
    public double dData;
    public Node left;
    public Node right;

    public void displayNode(){
        System.out.println("{");
        System.out.println(iData);
        System.out.println(", ");
        System.out.println(dData);
        System.out.println("} ");
    }
}
