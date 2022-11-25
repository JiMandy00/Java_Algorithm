// 22 11 25
// 최대공약수 구하기
// 재귀 없이
package recursion;

public class Euclidean02 {

    public int euclidean(int a, int b) {
        int r = a % b;
        while(true) {
            if(r == 0) {
                break;
            }
            r = a % b;
            int tmp = a;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Euclidean02 e = new Euclidean02();
        int inputA = 374;
        int inputB = 68;
        int result = e.euclidean(inputA, inputB);
        System.out.println(inputA + "와 " + inputB + "의 최대 공약수는? " + result);
    }
}
