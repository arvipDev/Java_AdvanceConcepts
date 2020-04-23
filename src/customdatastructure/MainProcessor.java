package customdatastructure;

public class MainProcessor {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst("Arvind");
        list.addFirst("Purushotham");
        list.addFirst("test");
        System.out.println();
        list.print();
        list.removeFirst();
        System.out.println();
        list.print();
        list.addFirst("test2");
        System.out.println();
        list.print();
    }
}
