public class NodeDouble<E> {

    public E data;
    public NodeDouble<E> next;
    public NodeDouble<E> prev;

    public NodeDouble(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
