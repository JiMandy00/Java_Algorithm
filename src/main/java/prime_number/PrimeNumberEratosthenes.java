// 22 11 02
// 프로그래머스 - 소수 찾기
// 에라토스테네스의 체를 적용

// 알고리즘
// N x N = 50 미만의 모든 소수를 구하는 에라토스테네스의 체
// 1. 2부터 50까지 숫자가 들어있는 LIst
//  1.1. 잘 지웠는지 확인해보자
// 2. 만든 List에서 2를 제외한 모든 2의 배수 지우기
// 3. 3을 제외한 모든 3의 배수 지우기 ... 7까지 반복. 왜냐하면 List는 50까지가 전부고 7의 배수가 49로 List에서 제일 큰 값의 배수를 가졌기 때문에


package prime_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberEratosthenes {
    public int solution(int n) { // 1 ~ n 사이의 정수

        List<Integer> arrayList = new ArrayList<>();
        int howManyRe = n;
        // 2 ~ n 담기
        for (int i = 1; i <= howManyRe; i++) {
            arrayList.add(i);
        }

        // 2, 3, 5, 7의 배수 지우기
        int[] primeNumbers = {2, 3, 5, 7};
        arrayList.remove(0);
        for (int i = 0; i < primeNumbers.length; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) % primeNumbers[i] == 0 && arrayList.get(j) > primeNumbers[i]) {
                    arrayList.remove(Integer.valueOf(j));
                }
            }
        }
        System.out.println(arrayList);
        int anwser = arrayList.size();
        return anwser;
    }

    public static void main(String[] args) {
        PrimeNumberEratosthenes pne = new PrimeNumberEratosthenes();
        int result = pne.solution(10);
        System.out.println(result);





    }
}
