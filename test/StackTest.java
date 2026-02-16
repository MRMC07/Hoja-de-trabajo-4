package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void testPushAndSize_ArrayList() {
        IStack<Integer> stack = new StackArrayList<>();
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size());
    }

    @Test
    void testPop_ArrayList() {
        IStack<Integer> stack = new StackArrayList<>();
        stack.push(5);

        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek_Vector() {
        IStack<Integer> stack = new StackVector<>();
        stack.push(7);

        assertEquals(7, stack.peek());
    }

    @Test
    void testIsEmpty_Vector() {
        IStack<Integer> stack = new StackVector<>();
        assertTrue(stack.isEmpty());

        stack.push(100);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testStackList_Singly() {
        IList<Integer> list = new SinglyLinkedList<>();
        IStack<Integer> stack = new StackList<>(list);

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testPopEmptyStack() {
        IStack<Integer> stack = new StackArrayList<>();

        assertThrows(RuntimeException.class, stack::pop);
    }
}

