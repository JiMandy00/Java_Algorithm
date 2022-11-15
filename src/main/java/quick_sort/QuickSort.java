package quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {


        int[] arr  = { 20, 18, 5, 19, 5, 25, 40, 50};

        // 1. 기준값 뽑기
        int pivot = arr[arr.length/2];
        System.out.println(pivot);

        // 2. 기준값 기준으로 왼/오 나누어 담기
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(pivot > arr[i]) {
                left.add(arr[i]);
            } else if (pivot < arr[i]) {
                right.add(arr[i]);
            }
        }
        System.out.println(left);
        System.out.println(right);



    }
}
