// 22 11 29
// 기수 == 기본이 되는 수
// 배열 10개를 만들고 7,4,5,9,1,0을 배열의 인덱스에 맞게 넣고
// 앞에서부터 꺼내어 정렬하는 코드 만들기

package radix_sort;

import java.util.Arrays;

public class RadixSort01 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};

        // 10개 생성
        int[] redixArr = new int[10];
        Arrays.fill(redixArr, -1); // -1로 채우기

        // 배열에서 꺼내서 넣기
        for (var i : arr) {
            redixArr[i] = i;
        }

        System.out.println(Arrays.toString(redixArr));

        // 1개씩 꺼내서 arr에 다시 넣기
        int cnt = 0;
        for (int i = 0; i < redixArr.length; i++) {
            if(redixArr[i] != -1) {
                arr[cnt++] = redixArr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
