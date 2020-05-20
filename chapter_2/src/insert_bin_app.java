public class insert_bin_app {
    public static void main(String[] args) {
        int max_size = 100;
        OrdArray arr;

        arr = new OrdArray(max_size);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);


        int search_key = 55;
        if(arr.find(search_key) != arr.size()){
            System.out.println("Found " + search_key);
        } else {
            System.out.print("Couldn't find " + search_key);
        }

        arr.display();

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        arr.insert(99);
        arr.insert(0);
        arr.display();
    }
}
