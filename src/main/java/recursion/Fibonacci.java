// 22 11 23
// 피보나치 수열
// 입력받은 번째 수열을 출력
package recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int input = 5;
        int result = fibonacci.fibonacci(input-1);
        System.out.println(input + "번째 피보나치 수 : " + result);
    }
}
