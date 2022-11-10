// 22 11 10

package dont_like_same_number;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DontLikeSameNumber {
    public static void main(String[] args) {

//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr = {4, 4, 4, 3, 3};

        List<Integer> list = new ArrayList<>();

        // 기존 방식은 3개 이상의 반복을 잡아내지 못 함
        // 리스트를 초기화하지 않고, 수가 겹치지 않으면 리스트에 add로 변경
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }

        System.out.println(list.toString());
    }
}
