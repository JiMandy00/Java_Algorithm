// 22 11 23
// 재귀 팩토리얼
package recursion;

public class Recursion04 {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Recursion04 r4 = new Recursion04();
        int input = 10;
        System.out.println(input + "! = " + r4.factorial(input));
    }
}
