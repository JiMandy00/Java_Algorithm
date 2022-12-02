// 22 11 30
// 부모 찾기

package tree;

public class Tree01 {
    public int findParent(int a , int b) {
        if(a>b) {
            return findParent(a/2, b)+1; // a를 부모 쪽으로
        }
        if(a<b) {
            return findParent(a, b/2)+1; //b를 부모 쪽으로
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int a = 3;
        int b =4;

        int parentA = Math.floorDiv(a, 2);
        int parentB = Math.floorDiv(b, 2);

        System.out.println("a의 부모 : " + parentA);
        System.out.println("b의 부모 : " + parentB);
    }
}
