public class NodeSimple<E> {

    public E data;
    public NodeSimple<E> next;

    public NodeSimple(E data) {
        this.data = data;
        this.next = null;
    }
}
