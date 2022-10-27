// 22 10 27
// 프로그래머스 - 해시 - 들엉오지 못한 선수

// 1. HashMap memo에 Paticipant를 모두 넣습니다.
// 2. completion에 들어ㅇ있는 이름을 key로 HashMap에서 검색한다.
// 2.1 있으면 0으로 체크
// 3. memo를 돌면서 1인 값을 찾습니다.
// 4. participant에 1이 있는지 찾습니다.
// 5. return 1

package Hash;

import java.util.HashMap;
import java.util.Map;

public class ARacer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i]; // 순회하면서
            // 중복문제를 해결하는 파트
            // 바로 put을 하지 않습니다.
            if (!memo.containsKey(key)) { // key값이 memo에 들어있지 않으면!
                memo.put(key, 0); // nullPoint가 나지 않게 0을 넣어준다.
            }
            memo.put(key, memo.get(key) + 1);
        }
        for (int i = 0; i < completion.length; i++) { // 완주한 사람만 찾아서 -1
            memo.get(completion[i]); // get은 찾는 것
            String key = completion[i];
            memo.put(key, memo.get(key) + -1);
        }
        for (String key : memo.keySet()) { // 전체 출력
            if (memo.get(key) == 1) { // 완주하지 못한 선수 == value값이 1인 선수
                return key;
            }

        }
        String answer = "";
        return answer;

    }

    public static void main(String[] args) {
        ARacer aRacer = new ARacer();
        String r1 = aRacer.solution(new String[]{"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});
        String r2 = aRacer.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String r3 = aRacer.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}