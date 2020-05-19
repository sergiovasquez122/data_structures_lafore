public class ClassDataApp {
    public static void main(String[] args) {
        int max_size = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(max_size);

        arr = new ClassDataArray(max_size);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamaarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        arr.displayA();

        String search_key = "Stimson";
        Person found;
        found = arr.find(search_key);
        if(found != null){
            System.out.print("Found");
            found.displayPerson();
        } else {
            System.out.println("Can't fijnd " + search_key);
        }

        System.out.println("Deleting Smith, Yee, and Croswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA();


    }
}
