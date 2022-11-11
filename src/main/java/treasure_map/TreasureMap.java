// 22 11 11

package treasure_map;

import java.util.Arrays;

public class TreasureMap {
    public String solution(int n, int[] arr1, int[] arr2) {

        String[] arr1B = new String[arr1.length];
        String[] arr2B = new String[arr2.length];
        String[][] arr1M = new String[n][n];
        String[][] arr2M = new String[n][n];

        // 10진수 -> 2진수
        for (int i = 0; i < n; i++) {
            arr1B[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            arr2B[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
        }
        System.out.println(Arrays.toString(arr1B));
        System.out.println(Arrays.toString(arr2B));


        return "";
    }

    public static void main(String[] args) {
        TreasureMap treasureMap = new TreasureMap();
        int[] arr1Ex = {9, 20, 28, 18, 11};
        int[] arr2Ex = {30, 1, 21, 17, 28};
        treasureMap.solution(5, arr1Ex, arr2Ex);
    }
}
