public class SortedListApp {
    public static void main(String[] args) {
        SortedLIst the_sorted_list = new SortedLIst();
        the_sorted_list.insert(20);
        the_sorted_list.insert(40);

        the_sorted_list.displayList();

        the_sorted_list.insert(10);
        the_sorted_list.insert(30);
        the_sorted_list.insert(50);

        the_sorted_list.displayList();

        the_sorted_list.remove();

        the_sorted_list.displayList();
    }
}
