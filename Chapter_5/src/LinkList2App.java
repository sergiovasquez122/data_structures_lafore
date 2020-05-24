public class LinkList2App {
    public static void main(String[] args) {
        LinkList the_list = new LinkList();

        the_list.insertFirst(22, 2.99);
        the_list.insertFirst(44, 4.99);
        the_list.insertFirst(66, 6.9);
        the_list.insertFirst(8, 8.99);

        the_list.displayList();

        Link f = the_list.find(44);
        if(f != null){
            System.out.println("Found Link with key " + f.iData);
        } else {
            System.out.println("Can't delete link");
        }

        the_list.displayList();

        Link d = the_list.delete(66);
        if( d != null)
            System.out.println("Deleted link with key " + d.iData);
        else System.out.println("Can't delete link");

        the_list.displayList();
    }
}
