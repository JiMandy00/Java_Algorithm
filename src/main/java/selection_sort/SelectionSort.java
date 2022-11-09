// 22 11 09
// 선택정렬

// 1. 최대값이 들어있는 인덱스 찾기
// 2. 최소값이 들어있는 인덱스 찾기
// 3. 선택정렬 구현

package selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int minIdx = 0;
        int tmp = 0;

        for (int i = 0; i < arr.length-1; i++) {
            minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;

        }

        System.out.println(Arrays.toString(arr));
    }

}

