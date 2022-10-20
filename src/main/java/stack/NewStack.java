// 22 10 20

package stack;

import java.lang.annotation.Target;
import java.util.EmptyStackException;

public class NewStack {
    private Integer[] arr;
    // 원래 arr였는데, Integer로 해봤읍니다.
    // 인코딩 에러 나는디?
    // int로 변경해도 인코딩 에러야
    private int top = 0;

    public NewStack() {
        this.arr = new Integer[10000];
    }

    public NewStack(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[top] = value;
        this.top++;
    }


//    public int pop() {
//        int value = this.arr[this.top-1];
//        this.top--;
//        return value;
//    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[--this.top]; // this.top = 2
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[this.top = 1];
    }

    public Integer[] getArr() {
        return arr;
    }
}
