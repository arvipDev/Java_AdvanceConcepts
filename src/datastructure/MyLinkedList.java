package datastructure;

public class MyLinkedList {

    private Node first;

    public MyLinkedList () {
        this.first = null;
    }

    public void addFirst (String name) {
        Node element = new Node();
        element.setName(name);
        element.next = first;
        first = element;
    }

    public void removeFirst () {
        first = first.next;
    }

    public void print () {
        Node temp = first;
        while (temp != null){
            temp.printNode();
            temp = temp.next;
        }
    }
}
