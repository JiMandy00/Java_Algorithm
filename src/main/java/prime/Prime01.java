// 22 12 02
// 소인수분해
package prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prime01 {
    public List<Integer> primeFactorization(int num) {
        List<Integer> primeNumbers = new ArrayList<>();
        int div = 2;
        while (num != 1) {
            if (num % div == 0) {
                num = num / div;
                primeNumbers.add(div);
            } else {
                div++;
            }
        }
        return primeNumbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Prime01 p = new Prime01();
        List<Integer> result = new ArrayList<>();
        result = p.primeFactorization(num);
        for (int n : result) {
            System.out.printf("%d ", n);
        }
    }
}
