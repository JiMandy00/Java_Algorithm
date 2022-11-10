// 22 11 10

package dont_like_same_number;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DontLikeSameNumber {
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        System.out.println(list.toString());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // arr로 값을 비교해서 list 지우기 => 에러
        // list로 변경
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
                }
            }
        System.out.println(list.toString());
    }
}
