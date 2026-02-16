package scr;
import java.util.ArrayList;

public class StackArrayList<E> implements IStack<E> {

    private ArrayList<E> list = new ArrayList<>();

    @Override
    public void push(E item) {
        list.add(item);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
