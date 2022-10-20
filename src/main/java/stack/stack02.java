package stack;

// stack02에서 add를 추가 했으니
// pop을 구현해보자

public class stack02 {
    private int[] arr = new int[10000];

    private int pointer = 0; // -1 == empty

    public stack02(int size) {
        this.arr = new int[size];
    }

    public stack02() {
    }

    public void push(int value) {
        arr[pointer] = value;
        pointer++;
    }

    public int[] getArr() {
        return arr;
    }

    public int pop() {
        // push를 하면 pointer도 자동으로 늘어나니까 제일 최신 값을 가리키고 있다고 생각할 수 있다.
        // 그래서 pop은 제일 최근에 배열에 삽입된 수를 찾아야하니까
        // arr[pointer]
        // -1은 왜 해주냐면..
        // 위 코드를 보면 배열 0에 10을 넣으면 pointer는 빈 배열 1을 가리킨다.
        // 20을 넣으면 pointer는 빈 배열 2를 가리킨다.
        // 에러가 날 수밖에!
        // 그러니 pointer를 1 감소 시켜주면 된다.
        int value = this.arr[this.pointer-1];
        // 숫자 하나를 뺄거니까 pointer도 같이 수가 줄어야한다.
        // return 이후로는 pointer--을 사용할 수 없으니까
        // value값에 배열을 미리 담고 pointer을 감소 시키고
        // return을 한 것이다.
        this.pointer--;
        return value;

    }
}
