public class DoubleLinkedList<E> implements IList<E> {

    private NodeDouble<E> head;
    private int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(E value) {
        NodeDouble<E> newNode = new NodeDouble<E>(value);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E value = head.data;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        size--;
        return value;
    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }

        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }
}
