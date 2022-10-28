import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiArray {

    public int[] solution(int[] arr, int[][] commands) { // 253 441 173
        int[] answer = new int[commands.length]; // commands 배열의 행의 개수의 길이 만큼 answer 배열을 생성 == answer[a, b,c]
        int idx = 0;
        for (int [] command : commands) { // 253
            int[] sliceArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++] = sliceArr[command[2]-1];


        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        MultiArray ma = new MultiArray();
        System.out.println(Arrays.toString(ma.solution(arr, commands)));
//        int[] arr1 = Arrays.copyOfRange(arr, 2 - 1, 5);
//        System.out.println(Arrays.toString(arr1));

    }
}
