// 22 11 23
// 피보나치 수열
package recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public int fibonacci(int n) {
        List<Integer> fibonacciNums = new ArrayList<>();
        int i = 0;
        fibonacciNums.add(1);
        i = 1;
        fibonacciNums.add(1);
        for (int j = 2; j < n; j++) {
            fibonacciNums.add(fibonacciNums.get(j-1) + fibonacciNums.get(j-2));
        }

        return fibonacciNums.get(n-1);
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int input = 10;
        int result = fibonacci.fibonacci(input);
        System.out.println(input + "번째 피보나치 수 : " + result);
    }
}
