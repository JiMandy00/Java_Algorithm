package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stack02Test {

    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndPop() {
        stack02 stack02 = new stack02();
        stack02.push(10);
        stack02.push(20);


        Assertions.assertEquals(20, stack02.pop());
        Assertions.assertEquals(10, stack02.pop());

    }

}