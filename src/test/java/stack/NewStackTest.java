package stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class NewStackTest {
    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        // .push()
        // .getArr)
        NewStack st = new NewStack();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        NewStack st = new NewStack();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        // st.pop()이 비어있을땐 어떡할거냐
    }

    @Test
    void isEmpty() {
        NewStack st = new NewStack();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());

    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>();
        st.pop();
    }

    @Test
    void peek() {
        NewStack st = new NewStack();
        // stack이 비었는데, peek할 때
        assertThrows(EmptyStackException.class, ()-> {
            st.peek();
        });
        st.push(10);
        int peeked = (int) st.peek();
        assertEquals(10, peeked);
    }

}

