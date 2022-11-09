// 22 11 09
// 선택정렬

// 1. 최대값이 들어있는 인덱스 찾기

package selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int max = 0;
        int maxIdx = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            if (min > max) {
                max = min;
                maxIdx = i;
            }
        }
        System.out.println("min : " + min);
        System.out.println("max : " + max);
        System.out.println("maxIdx : " + maxIdx);

    }
}
