// 22 11 25
// 최대공약수 구하기
package recursion;

public class Euclidean {

    public int euclidean(int a, int b) {
        if (b == 0) { return a; }

        int r = a % b;
        return euclidean(b, r);
    }
    public static void main(String[] args) {
        Euclidean e = new Euclidean();
        int inputA = 42;
        int inputB = 196;
        int result = e.euclidean(inputA, inputB);
        System.out.println(inputA + "와 " + inputB + "의 최대 공약수는? " + result);
    }
}
