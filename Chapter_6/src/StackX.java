public class StackX {
    private int maxSize;
    private Params[] stackArray;
    private int top;

    public StackX(int s){
        maxSize = s;
        stackArray = new Params[maxSize];
        top = -1;
    }

    public void push(Params p){
        stackArray[++top] = p;
    }

    public Params pop(){
        return stackArray[top--];
    }

    public Params peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
