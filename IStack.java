package scr;
public interface IStack {

    void push(int value);
    int pop();
    int peek();
    boolean isEmpty();
    int size();
}