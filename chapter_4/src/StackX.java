public class StackX {
    private int max_size;
    private char[] stack_array;
    private int top;

    public StackX(int s){
        max_size = s;
        stack_array = new char[max_size];
        top = -1;
    }

    public void push(char value){
        stack_array[++top] = value;
    }

    public char peek(){
        return stack_array[top];
    }

    public char pop(){
        return stack_array[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == max_size  - 1;
    }
}
