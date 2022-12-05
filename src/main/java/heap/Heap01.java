package heap;

import java.util.Arrays;

public class Heap01 {
    public static void main(String[] args) {
        int arr[] = new int[]{6, 5, 7, 8};

        int tmp = arr[1];
        arr[1] = arr[3];
        arr[3] = tmp;
        System.out.println(Arrays.toString(arr));

        tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
