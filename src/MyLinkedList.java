public class MyLinkedList<E> {
    private MyNodeForLinkedList<E> head;

    public MyLinkedList(MyNodeForLinkedList<E> head) {
        this.head = head;
    }

    void printLinkedList(){
        MyNodeForLinkedList<E> h = head;
        while (h != null) {
            System.out.println(h.getData());
            h = h.getNext();
        }
    }
    E insertAtEnd(E data){
        MyNodeForLinkedList<E> h = head;
        while (h.getNext() != null){
            h = h.getNext();
        }
        MyNodeForLinkedList<E> newNode = new MyNodeForLinkedList<>(data);
        h.setNext(newNode);
        return newNode.getData();
    }




}
