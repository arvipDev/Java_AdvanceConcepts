package datastructure;

public class Node {

    public Node next;
    private String name;

    public Node (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node () {
        this.name = null;
    }

    public void printNode () {
        System.out.println("Node's data: Name - " + this.name + ", pointing at next node at location" + this.next);
    }

}
