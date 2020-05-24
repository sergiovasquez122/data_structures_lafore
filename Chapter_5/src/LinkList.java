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

    public void displayList(){
        System.out.print("List (first-->last): ");
        for(Link current = first;current != null; current = current.next){
            current.displayLink();
        }
        System.out.println();
    }
}
