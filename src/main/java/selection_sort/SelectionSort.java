// 22 11 09
// 선택정렬

// 1. 최대값이 들어있는 인덱스 찾기
// 2. 최소값이 들어있는 인덱스 찾기

package selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int max = arr[arr.length-1];
        int maxIdx = arr.length;
        int min = 0;
        int minIdx = 0;
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            if (min > max) {
                tmp = max;
                max = min;
                min = tmp;
                maxIdx = i;
            }

            if (min < max) {
                minIdx = i;
            }
        }
        System.out.println("min : " + min);
        System.out.println("minIdx : " + minIdx);
        System.out.println("max : " + max);
        System.out.println("maxIdx : " + maxIdx);

    }
}
