public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack the_stack = new LinkStack();
        the_stack.insert(20);
        the_stack.insert(40);

        the_stack.displayList();

        the_stack.insert(60);
        the_stack.insert(80);

        the_stack.displayList();

        the_stack.displayList();
        the_stack.delete();
        the_stack.delete();

        the_stack.displayList();


    }
}
