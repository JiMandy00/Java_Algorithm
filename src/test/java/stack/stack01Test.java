package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stack01Test {

    @Test
    void pushTest() {
        stack01 stack01 = new stack01();
        // 메서드를 수정 했으니 아래는 주석하고, 그 아래 새로운 push 코드 작성했다.
        // int[] arr = stack01.push(10);
        stack01.push(10);
        stack01.push(20);

        int[] arr = stack01.getArr();
        //10, 20
        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }


}