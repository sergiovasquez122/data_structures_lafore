public class LinkListApp {
    public static void main(String[] args) {
        LinkList the_list = new LinkList();
        the_list.insertFirst(22,2.99);
        the_list.insertFirst(44, 4.99);
        the_list.insertFirst(66, 6.99);
        the_list.insertFirst(88, 8.99);

        the_list.displayList();

        while( !the_list.isEmpty() ){
            Link aLink = the_list.deleteFirst();
            System.out.print("Deleted: ");
            aLink.displayLink();
            System.out.print("");
        }
        the_list.displayList();
    }
}
