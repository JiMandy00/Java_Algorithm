// 22 11 23
// 재귀로 별 찍기
package recursion;

public class Recursion03 {
    public String star(int n) {
        if (n < 1) {
            return "";
        }
        System.out.print("*");
        return star(n-1);
    }

    public static void main(String[] args) {
        Recursion03 r3 = new Recursion03();
        r3.star(5);
    }
}
