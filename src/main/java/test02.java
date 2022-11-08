//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//// 22 11 07
//// 나누어 떨어지는 숫자 배열
//// 배열에서 계산해서 list에 넣고
//// list에서 다시 array로 변경
//// array를 정렬해서 return
//
//public class test02 {
//    class Solution {
//        public int[] solution(int[] arr, int divisor) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i]%divisor == 0) {
//                    list.add(arr[i]);
//                }
//            }
//
//            if (list.size() == 0) {
//                return new int[-1];
//            }
//
//            int[] answer = new int[list.size()];
//
//            for (int i = 0; i < list.size(); i++) {
//                answer[i] = list.get(i);
//            }
//
//            Arrays.sort(arr);
//            return answer;
//        }
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        solution.solution();
//    }
//}
