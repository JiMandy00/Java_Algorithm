package stack;

// .push() 구현
// int[] arr = new int[n];
// .push(int value)
// stack은 정해진 용량이 초과하면 stack overflow
// 다행히도 array는 길이가 정해져 있다.

// 이해를 돕기 위해서 array를 사용
// 실제로 stack을 구현 하려면 다른 방식으로 접근 해야한다.
// 아마 List?

public class stack01 {
    private int[] arr = new int[10000];
    // pointer의 역할
    // 새로 들어온 값과 배열 주소만 나타내줌
    private int pointer = 0; // -1 == empty

    public stack01(int size) {
        this.arr = new int[size];
    }

    public stack01() {
    }

    public void push(int value) {
        // int[] arr = new int[10000]; 얘를 push  밖으로 뺌

        // 우리가 만들고 싶은건
        // 10 arr[0]에 들어가고 20이 들어오면 arr[1]에 들어가고.. 착착착 순서대로 쌓는걸 원해
        // arr[0] = value; 그래서 이걸 아래 코드 두 줄로 변경
        arr[pointer] = value;
        pointer++;
    }

    // arr를 return해주는 method도 구현해봤음니다.
    public int[] getArr() {
        return arr;
    }
}
