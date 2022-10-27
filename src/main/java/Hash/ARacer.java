// 22 10 27
// 프로그래머스

// 1. HashMap memo에 Paticipant를 모두 넣습니다.
// 2. completion에 들어ㅇ있는 이름을 key로 HashMap에서 검색한다.
// 2.1 있으면 0으로 체크
// 3. memo를 돌면서 1인 값을 찾습니다.

// participant에 1이 있는지 찾습니다.
// return 1
package Hash;

import java.util.HashMap;
import java.util.Map;

public class ARacer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i]; // 순회하면서
            memo.put(key, 1); // 완주 안됨을 입력
        }
        for (int i = 0; i < completion.length; i++) {
            memo.get(completion[i]); // get은 찾는 것
            String key = completion[i];
            memo.put(key, 0); // 완주한 선수한테 0
        }
        for (String key : memo.keySet()) { // 전체 출력
            if (memo.get(key) == 1) { // 완주하지 못한 선수 == value값이 1인 선수
                return key;
            }

        }
        return null; // 임시

    }
}