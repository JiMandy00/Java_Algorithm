// 22 11 17
// 16일에 제작했던 코드를 완성


package quick_sort;

import java.util.Arrays;

public class QuickSort03 {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx; // 0
        int rightIdx = endIdx; // 7
        int pivot = arr[(startIdx + endIdx) / 2]; // (0 + 7)/2
        System.out.println("pivot : " + pivot);

        while(leftIdx <= rightIdx){ // 0 <= 7
            // left, right 교환 대상을 찾으면 멈추는 반복문
            while(arr[leftIdx] < pivot) leftIdx += 1;
            while(arr[rightIdx] > pivot) rightIdx -= 1;

            if(leftIdx <= rightIdx){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1; // index 재개
                rightIdx -= 1;
            }
            System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx);
            System.out.println(Arrays.toString(arr));
        }

        if(startIdx < rightIdx) {
            sort(arr, startIdx, rightIdx);
        }
        if(leftIdx < endIdx) {
            sort(arr, leftIdx, endIdx);
        }

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort03 qs3 = new QuickSort03();
        var r = qs3.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(r));
    }
}
