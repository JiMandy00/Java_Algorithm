// 22 11 07
// 하샤드 수
// 입력받은 수를 분리해서 배열에 담기
import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        int[] splitNum = new int[4];
        int num = 621;

        int arrNumber = 0;
        while (num != 0) {
            splitNum[arrNumber] = num % 10;
            arrNumber++;
            num = num / 10;
        }

        System.out.println(Arrays.toString(splitNum));


    }
}
