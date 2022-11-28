// 22 11 28
// 재귀 적용

package alphabet;

public class Alpabet01 {
    public char alphabetTable01(char a) {
        if (a > 90) {
            return '?';
        }

        System.out.print(a + ", ");
        a = (char)((int)a + 1);
        return alphabetTable01(a);
    }

    public char alphabetTable02(char a, char b) {
        if (a > 90) {
            return '?';
        }
        System.out.printf("%s%s, ", a, b);
        b = (char)((int)b + 1);
        if (b > 90) {
            a += 1;
            b = 65;
        }
        return alphabetTable02(a, b);
    }

    public static void main(String[] args) {
        Alpabet01 alpabet01 = new Alpabet01();
        alpabet01.alphabetTable01('A');
        System.out.println();
        alpabet01.alphabetTable02('A', 'A');
    }
}
