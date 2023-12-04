public class MyNodeForLinkedList<E> {
    private MyNodeForLinkedList<E> next;
    private E data;

    public MyNodeForLinkedList(E data) {
        this.data = data;
    }

    public MyNodeForLinkedList<E> getNext() {
        return next;
    }

    public void setNext(MyNodeForLinkedList<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
