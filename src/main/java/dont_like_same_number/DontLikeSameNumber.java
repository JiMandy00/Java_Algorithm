// 22 11 10

package dont_like_same_number;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DontLikeSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int num1 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num1) {
                list.add(arr[i]);
                num1 = arr[i];
            }
        }
        int cnt = 0;
        for (int num2 : list) {
            answer[cnt] = num2;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
