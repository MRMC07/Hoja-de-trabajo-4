package scr;

public class StackList implements IStack {

    private IList<Integer> list;

    public StackList(IList<Integer> list) {
        this.list = list;
    }

    @Override
    public void push(int value) {
        list.addFirst(value);
    }

    @Override
    public int pop() {
        Integer value = list.removeFirst();
        return value == null ? -1 : value;
    }

    @Override
    public int peek() {
        Integer value = list.getFirst();
        return value == null ? -1 : value;
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
