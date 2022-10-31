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
import java.util.Arrays;
import java.util.List;

public class PreparedTest {

    int[] supoja_1 = {1, 2, 3, 4, 5}; // 학생1
    int[] supoja_2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 학생2
    int[] supoja_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 학생3

    int[] cnt = new int[3]; // 학생 점수를 담는 배열

    public int[] solution(int[] answers) { // 학생들 점수 계산하는 부분

        for (int i = 0; i < answers.length; i++) { // 답지 개수 만큼 반복
            if(supoja_1[i%supoja_1.length] == answers[i]) { // 숫자를 배열의 길이만큼 나눠주는 것으로 변경
                cnt[0] += 1;
            }
            if(supoja_2[i%supoja_2.length] == answers[i]) {
                cnt[1] += 1;
            }
            if(supoja_3[i% supoja_3.length] == answers[i]) {
                cnt[2] += 1;
            }
        }

        // 문제 제일 많이 맞춘 학생을 계산하는 부분
        // Math.max를 써볼까?
        // int[] winner = new int[1]; // 흠.. 이러면 만약 동점이 생겨서 여러명 넣어야 하는 상황에서 가변적으로 배열 크기를 변경할 수 없음
        // 위 같은 고민을 해결하고자 동적 배열인 ArrayList를 사용하겠습니다.
        List<Integer> winner = new ArrayList<>();

        // int max = Math.max(int cnt[0], int cnt[1], int cnt[2]);
        // 너무 많은 인수를 넣어서 에러가 났다. 아래처럼 수정
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2])); // Math.max 변경

        // 점수가 최고면 우승자 리스트에 add
        if(max==cnt[0]) {
            winner.add(1); // 1번 학생
        }
        if(max==cnt[1]) {
            winner.add(2);
        }
        if(max==cnt[2]) {
            winner.add(3);
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
        int[] arr = pt.solution(solution);
        System.out.println(Arrays.toString(arr));


    }

}
