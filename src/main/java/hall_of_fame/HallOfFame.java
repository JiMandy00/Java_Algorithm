// 22 12 01
// 프로그래머스 명예의 전당

package hall_of_fame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int k = 3;
        int score_length = 7; // 7일
        int score = 0;
        for (int i = 0; i < score_length; i++) {
            score = (int) (Math.random() * 2000 + 0);
            list.add(score);
            int max = Collections.max(list);
            int min = Collections.min(list);
            if (list.size() > k) {
                if (score > max) {
                    list.remove("max");
                    list.add(score);
                    Collections.sort(list);
                } else if (score > min) {
                    list.remove("min");
                    list.add(score);
                    Collections.sort(list);
                }
            }
        }
    }

}

