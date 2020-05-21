public class exercise_3_3 {
    public static void main(String[] args) {
        int max_size = 100;
        ArrayIns arrayIns = new ArrayIns(100);
        arrayIns.insert(1);
        arrayIns.insert(1);
        arrayIns.insert(2);
        arrayIns.insert(2);
        arrayIns.insert(3);
        arrayIns.insert(3);
        arrayIns.insert(4);
        arrayIns.insert(4);
        arrayIns.insert(5);
        arrayIns.insert(5);
        arrayIns.insert(6);
        arrayIns.insert(6);
        arrayIns.nodups();
        arrayIns.display();
    }
}
