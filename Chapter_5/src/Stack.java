/**
 * Exercise 5.4
 * Implement a Stack Based on a Circular Linked list
 */
public class Stack {
    private CircularList circularList;

    public Stack(){
        circularList = new CircularList();
    }

    public int size(){
        return circularList.size();
    }

    public int peek(){
        return circularList.current();
    }

    public int pop(){
        return circularList.delete();
    }

    public void push(int value){
        circularList.insert(value);
    }

    public boolean isEmpty(){
        return circularList.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
