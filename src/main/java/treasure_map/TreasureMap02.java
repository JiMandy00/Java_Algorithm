// 22 11 11
// 비트 연산자로

package treasure_map;

public class TreasureMap02 {
    public String solution(int n, int[] arr1, int[] arr2) {

        var answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1", "#").replace("0", " ");
            // 자릿수를 맞춰주는 연산
            // 이해 못 했음!!
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];

        }

        return "";
    }

    public static void main(String[] args) {

    }
}
