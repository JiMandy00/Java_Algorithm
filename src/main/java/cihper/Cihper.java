// 22 11 18

package cihper;

import java.util.Arrays;

public class Cihper {
    public String solution(String s, int n) {
        int[] intArr = new int[s.length()];
        char[] charArr = new char[s.length()];
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int askii = (int)(s.charAt(i));
            if (askii == 90) {
                askii = 64;
            } else if (askii == 122) {
                askii = 96;
            }

            if (askii != 32) {
                intArr[i] = (askii + n);
            } else {
                intArr[i] = 32;
            }

        }

        for (int i = 0; i < s.length(); i++) {

            answer += (char)intArr[i];
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;

        Cihper c = new Cihper();
        c.solution(s, n);
    }
}
