// 22 11 09
// 선택정렬

// 1. 최대값이 들어있는 인덱스 찾기
// 2. 최소값이 들어있는 인덱스 찾기
// 3. 선택정렬 내림차순 구현
// 4. 선택정렬 오름차순 구현

package selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // 오름차순
        int minIdx = 0;
        int tmp1 = 0;

        for (int i = 0; i < arr.length-1; i++) { // 0부터 순차적으로 배열에 담는 로직
            minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            tmp1 = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp1;

        }

        System.out.println(Arrays.toString(arr));

        // 내림차순
        int maxIdx = 0;
        int tmp2 = 0;

        for (int i = 0; i < arr.length-1; i++) { // 0부터 순차적으로 배열에 담는 로직
            minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            tmp2 = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = tmp2;

        }

        System.out.println(Arrays.toString(arr));
    }

}

