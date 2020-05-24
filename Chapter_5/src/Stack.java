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
}
