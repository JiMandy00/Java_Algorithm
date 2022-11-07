// 22 11 07
// 하샤드 수
// 입력받은 수를 분리해서 배열에 담기
// array를 이용하지 않아도 더해서 사용 가능할 거 같아서.. array를 없앴다.

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        int num = 621;

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        if (num%sum == 0) {
            System.out.println("하샤드 수가 맞습니다.");
        } else {
            System.out.println("하샤드 수가 아닙니다.");
        }


    }
}
