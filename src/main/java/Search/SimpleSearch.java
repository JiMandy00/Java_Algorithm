package Search;// 22 11 08
// simple search

// [question]
// k를 찾으면 위치를, 찾지 못하면 -1 출력

// [data]
// 10
// 2 3 7 4 9 10 223 111 23 39
// 111




import java.util.Scanner;

public class SimpleSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
    }
}
