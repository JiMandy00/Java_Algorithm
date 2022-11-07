import java.util.Arrays;

// 22 11 07
// 나누어 떨어지는 숫자 배열
public class test02 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = arr;
            int[] answerTest = {};
            int cnt = 0;

            for (int i = 0; i < answer.length; i++) {
                if (answer[i] % divisor == 0) {
                    answerTest[cnt] = answer[i];
                }
            }

            answer = answerTest;

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        Solution solution = new Solution(arr, divisor);
        solution.solution(arr, divisor);
    }
}
