package Search;// 22 11 08
// Binary search

// [question]
// k를 찾으면 위치를, 찾지 못하면 -1 출력

// [data]
// 10
// 2 3 7 4 9 10 223 111 23 39
// 111


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int targetNum = 7;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int startPoint = 0;
        int endPoint = nums.length;

        // 중간값 찾기
        int half = (int)((nums.length)/2);

        // 인덱스(시작점, 끝점) 옮기기
        if (targetNum < half) {
            endPoint = half;
            half = (int)(half/2);
        } else if (targetNum > half) {
            startPoint = half;
            half = (int)(half/2);
        } else {
            targetNum = half;
        }

        System.out.println(startPoint); // 5
        System.out.println(endPoint); // 11
        System.out.println(nums[startPoint]); // 6

        // 같은지 비교하기
        while (startPoint < endPoint) {
            if (nums[startPoint] == targetNum) {
                System.out.println(startPoint);
                break;
            }
            startPoint++;
        }

    }
}
