package quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {

    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> list = new ArrayList<>();

        list.addAll(left);
        list.addAll(mid);
        list.addAll(right);

        return list;
    }

    public List<Integer> sort(List<Integer> arr) {

        if(arr.size() <= 1) return arr; // 재귀 탈출 조건

        // 1. 기준값 뽑기
        int pivot = arr.get(arr.size()/2);
        System.out.println("pivot : " + pivot);

        // 2. 기준값 기준으로 왼/오 나누어 담기
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();


        for (int i = 0; i < arr.size(); i++) {
            if(pivot > arr.get(i)) {
                left.add(arr.get(i));
            } else if (pivot < arr.get(i)) {
                right.add(arr.get(i));
            } else mid.add(arr.get(i));
        }

        System.out.println(left);
        System.out.println(right);
        return merge(left, mid, right);
    }

    public static void main(String[] args) {

        int[] arr  = { 20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        QuickSort qs = new QuickSort();
        System.out.println(qs.sort(arrList));
    }
}
