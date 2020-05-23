public class StackApp {
    public static void main(String[] args) {
        StackLong the_stack = new StackLong(10);
        the_stack.push(20);
        the_stack.push(40);
        the_stack.push(60);
        the_stack.push(80);

        while( !the_stack.isEmpty()){
            long value = the_stack.pop();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
