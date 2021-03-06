public class LinkList {
    private Link first;

    public LinkList(){
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key){
        Link current = first;
        while(current.next != null && current.iData != key){
            current = current.next;
        }
        return current;
    }

    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.next != null && current.iData != key){
            previous = current;
            current = current.next;
        }
        if(current == first) first = first.next;
        else previous.next = current.next;
        return current;
    }

    public void displayList(){
        System.out.print("List (first-->last): ");
        for(Link current = first;current != null; current = current.next){
            current.displayLink();
        }
        System.out.println();
    }
}
