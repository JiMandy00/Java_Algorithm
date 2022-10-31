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

    int member = 3; // 몇 번을 반복할지 일단 지정 해놨습니다... 좋은 방법은 아닌듯
    int cnt1 = 0; // 몇 문제를 맞췄는지 cnt하기 위해서 선언
    int cnt2 = 0;
    int cnt3 = 0;

    int[] supoja_1 = {1, 2, 3, 4, 5}; // 학생1
    int[] supoja_2 = {2, 1, 2, 3, 2}; // 학생2
    int[] supoja_3 = {3, 3, 1, 1, 2}; // 학생3

    public int[] solution(int[] answers) {

        for (int i = 1; i <= member; i++) { // 정답이랑 비교해서 맞는지 맞지 않는지 계산하는 반복문(미완)
            for (int j = 0; j < answers.length; j++) {


            }
        }

        return answers;
    }

    public static void main(String[] args) {

    }

}
