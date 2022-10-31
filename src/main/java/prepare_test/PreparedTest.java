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

public class PreparedTest {

    int cnt1 = 0; // 몇 문제를 맞췄는지 cnt하기 위해서 선언
    int cnt2 = 0;
    int cnt3 = 0;

    int[] supoja_1 = {1, 2, 3, 4, 5}; // 학생1
    int[] supoja_2 = {2, 1, 2, 3, 2}; // 학생2
    int[] supoja_3 = {3, 3, 1, 1, 2}; // 학생3

    public int[] solution(int[] answers) {

        for (int i = 0; i < supoja_1.length; i++) { // supoja_1 길이만큼 반복한다는게 좋은 방법은 아닌거 같음
            if (supoja_1[i] == answers[0]) {
                cnt1 += 1; // 맞춘 개수만큼 +1
            }
            if (supoja_2[i] == answers[0]) {
                cnt2 += 1;
            }
            if (supoja_3[i] == answers[0]) {
                cnt3 += 1;
            }
        }
        // 어? 1번 학생이 왜 1개를 맞추지? 전부 다 맞춰야하는데?
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);






        return answers;
    }

    public static void main(String[] args) {
        PreparedTest pt = new PreparedTest();
        int[] solution = {1,2,3,4,5};
        pt.solution(solution);

    }

}
