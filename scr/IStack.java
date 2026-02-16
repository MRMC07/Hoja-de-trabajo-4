package scr;
public interface IStack<E> {

    void push(E item);

    E pop();

    E peek();

    boolean isEmpty();

    int size();
}
