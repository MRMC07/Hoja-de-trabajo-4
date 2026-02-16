public class SimpleLinkedList<E> implements IList<E> {

    private NodeSimple<E> head;
    private int size;

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(E value) {
        NodeSimple<E> newNode = new NodeSimple<E>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E value = head.data;
        head = head.next;
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
