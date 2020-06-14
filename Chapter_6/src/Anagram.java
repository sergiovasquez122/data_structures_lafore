public class Anagram {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) {

    }

    public static void displayWord(){
        if(count < 99)
            System.out.print(" ");
        if(count < 9)
            System.out.print(" ");
        System.out.print(++count + " ");
        for(int j = 0;j < size;++j)
            System.out.print(++count + " ");
        System.out.print("   ");
        if(count % 6 == 0)
            System.out.println("");
    }
}
