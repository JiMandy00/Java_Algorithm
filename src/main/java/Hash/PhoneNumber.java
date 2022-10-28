// 22 10 28
// 프로그래머스 - 해시 - 전화번호 목록

// indexOf() 몇 번째 인덱스에 해당 글자가 있는지 리턴

// 제한사항
// 1. 전화번호부 길이
// 2. 중복 불가 == HashSet
// 3. 전화번호 길이 10~20


package Hash;

import java.util.HashSet;

public class PhoneNumber {

    public boolean solution(String[] phone_book) {

        // 중복제거
        HashSet<String> hs = new HashSet<>();

        for (var num : phone_book) {
            hs.add(num);
        }

        for (String phoneBook : phone_book) {
            for (int i = 0; i < phoneBook.length(); i++) {
                // 특정 값이 들어있는지 없는지 확인
                if (hs.contains(phoneBook.substring(0, i))) {
                    return false;
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println("12".indexOf("123"));
        // -1출력.  왜냐하면 123은 없으니까

        System.out.println("12".indexOf("12"));
        // 0출력. 왜냐하면 0번째에 12가 있으니까
    }
}
