public class RPNStack {

    private int max_size;
    private char[] stack_array;
    private int top;

    public RPNStack(int s){
        max_size = s;
        stack_array = new char[max_size];
        top = -1;
    }

    public void push(char value){
        stack_array[++top] = value;
    }

    public char pop(){
        return stack_array[top--];
    }

    public char peek(){
        return stack_array[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public char peekN(int n){
        return stack_array[n];
    }

    public int size(){
        return top + 1;
    }

    public void displayStack(String s){
        System.out.print(s);
        System.out.print("Stack (Bottom->top):");
        for(int i = 0;i < size();++i){
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println();
    }
}
