// 22 11 02
// 프로그래머스 - 소수 찾기
// 에라토스테네스의 체를 적용

// 알고리즘
// N x N = 50 미만의 모든 소수를 구하는 에라토스테네스의 체
// 1. 2부터 50까지 숫자가 들어있는 Array
// 2. num 행, check행을 만들어서 해당 수가 소수인 본인이 아니며 자신의 배수이면 check에 false를 삽입. 아니면 true


package prime_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberEratosthenes02 {
    public void solution(int n) { // 1 ~ n 사이의 정수

        int N = 50; // N = 50

        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개

        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성

        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false

        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기



    }

    public static void main(String[] args) {
        PrimeNumberEratosthenes pne = new PrimeNumberEratosthenes();
        pne.solution(10);



    }
}
