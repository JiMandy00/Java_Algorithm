//import java.beans.PropertyEditorSupport;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//
//public class Que {
//
//    public int getKthNum (int[] command) { // n번째 숫자를 구하는 메서드
//        int fromIndex = command[0]; // 0번째 부터
//        int toIndex = command[1]; // 1번째 까지
//        int nth = command[2]; // 2번째에 있는 숫자
//
//        int result = 0;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 자동 오름차순 정렬이 되는 큐 사용
//        for (int i = fromIndex-1; i < toIndex; i++) { // 1번부터 시작하니 -1 ?? 무슨 말
//            pq.add(arr[i]);
//        }
//
//        for (int i = 0; i < nth ; i++) {
//            result = pq.poll(); // pop
//        }
//        return result;
//    }
//
//    public int[] solution(int[] arr, int[][] commands) {
//
//        int[] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//            answer[i] = getKthNum(commands[i]);
//        }
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        int[] arr = {3, 30, 34, 5, 9};
//        int[][] commands = {{2, 5, 3},
//                            {4, 4, 1},
//                            {1, 7, 3}};
//
//        Que que = new Que();
//        que.getKthNum(commands);
//        System.out.println(Arrays.toString(ma.solution(arr, commands)));
//    }
//}
