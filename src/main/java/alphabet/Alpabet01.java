// 22 11 28

package alphabet;

public class Alpabet01 {
    public void alphabetTable() {
        System.out.println("ABCD...");
        for (int i = 65; i <= 90; i++) {
            char alphabet = (char)i;
            System.out.print(alphabet + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("AA, AB, AC...");
        for (int i = 65; i <= 90; i++) {
            for (int j = 65; j <= 90 ; j++) {
                char alphabet01 = (char)i;
                char alphabet02 = (char)j;
                System.out.printf("%s%s", alphabet01, alphabet02 + ", ");
            }
        }


    }
    public static void main(String[] args) {
        Alpabet01 alpabet01 = new Alpabet01();
        alpabet01.alphabetTable();
    }
}
