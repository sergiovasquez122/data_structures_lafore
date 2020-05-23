public class StackX {
    private int max_size;
    private long[] stack_array;
    private int top;

    public StackX(int s){
        max_size = s;
        stack_array = new long[max_size];
        top = -1;
    }

    public void push(long value){
        stack_array[++top] = value;
    }

    public long peek(){
        return stack_array[top];
    }

    public long pop(){
        return stack_array[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }

    public boolean isFull(){
        return top == max_size - 1;
    }
}
