// 22 11 18

package cihper;

import java.util.Arrays;

public class Cihper {
    public String solution(String s, int n) {
        int[] intArr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArr[i] = ((int)(s.charAt(i)))+1;
            if (intArr[i] == 91) {
                intArr[i] = 65;
            } else if (intArr[i] == 123) {
                intArr[i] = 97;
            }
        }

        System.out.println(Arrays.toString(intArr));





        return "";
    }
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;

        Cihper c = new Cihper();
        c.solution(s, n);
    }
}
