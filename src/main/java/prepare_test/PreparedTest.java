// 22 10 31
// 프로그래머스 모의고사

// 1번 수포자 1, 2, 3, 4, 5
// 2번 수포자 2, 1, 2, 3, 2, 4, 2, 5
// 3번 수포자 3, 3, 1, 1, 2, 2, 4, 4, 5, 5

// answers [1, 2, 3, 4, 5] [1]
// answers [1, 3, 2, 4, 2] [1, 2, 3]


// 최대 10,000 문제
// 가장 높은 점수를 가진 사람을 출력
// 높은 점수를 가진 사람이 여럿이면 오름차순

package prepare_test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PreparedTest {

    int[] supoja_1 = {1, 2, 3, 4, 5}; // 학생1
    int[] supoja_2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 학생2
    int[] supoja_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 학생3

    int[] cnt = new int[3]; // 학생 점수를 담는 배열

    public int[] solution(int[] answers) { // 학생들 점수 계산하는 부분

        for (int i = 0; i < answers.length; i++) { // 답지 개수 만큼 반복
            if(supoja_1[i%5] == answers[i]) { // 왜 %하는지 아직도 이해를 못했지만 다른 분들 코드 봤음
                cnt[0] += 1;
            }
            if(supoja_2[i%8] == answers[i]) {
                cnt[1] += 1;
            }
            if(supoja_3[i%10] == answers[i]) {
                cnt[2] += 1;
            }
        }

        // 문제 제일 많이 맞춘 학생을 계산하는 부분
        // Math.max를 써볼까?
        // int[] winner = new int[1]; // 흠.. 이러면 만약 동점이 생겨서 여러명 넣어야 하는 상황에서 가변적으로 배열 크기를 변경할 수 없음
        // 위 같은 고민을 해결하고자 동적 배열인 ArrayList를 사용하겠습니다.
        List<Integer> winner = new ArrayList<>();


        if (cnt[0] > cnt[1]) {
            if (cnt[0] > cnt[2]) {
                winner.add(cnt[0]);
            } else {
                winner.add(cnt[0]);
            }
        } else if (cnt[1] > cnt[2]) {
            winner.add(cnt[1]);
        } else {
            winner.add(cnt[2]);
        }

        answers = new int[winner.size()];
        for (int i = 0; i < winner.size(); i++) {
            answers[i] = winner.get(i);
        }

        return answers;
    }

    public static void main(String[] args) {
        PreparedTest pt = new PreparedTest();
        int[] solution = {1,2,3,4,5};
        System.out.println((pt.solution(solution).toString()));

    }

}
