// 22 11 10

package dont_like_same_number;

import java.util.ArrayList;
import java.util.List;

public class DontLikeSameNumber {
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1}; // 7
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        System.out.println(list.toString());

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list.toString());
    }
}
