package scr;
import java.util.Vector;

public class StackVector<E> implements IStack<E> {

    private Vector<E> vector = new Vector<>();

    @Override
    public void push(E item) {
        vector.add(item);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return vector.remove(vector.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return vector.lastElement();
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }

    @Override
    public int size() {
        return vector.size();
    }
}
 