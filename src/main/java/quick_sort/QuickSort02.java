// 22 11 16

// 1. pivot 정하기
// 2. pivot > arr[leftIdx] = leftIdx += 1
// 3. pivot < arr[rigthIdx] = rightIdx -= 1
// 4. leftIdx ≤ rightIdx 면 교환
// 5. 교환 후 leftIdx += 1, rightIdx -= 1

package quick_sort;

public class QuickSort02 {
    public int[] Sort(int[] arr) {

        int pivot = arr[(int)(arr.length/2)]; // arr 절반이 되는 값이 기준
        int leftIdx = 0;
        int rightIdx = arr.length;
        int tmp = 0;

        if (pivot > arr[leftIdx]) {
            leftIdx += 1;
        }
        if (pivot < arr[rightIdx]) {
            rightIdx -= 1;
        }
        if (leftIdx >= rightIdx) {
            tmp = leftIdx;
            leftIdx = rightIdx;
            rightIdx = tmp;

            // 이 부분은 왜 해주는 거지?
            leftIdx += 1;
            rightIdx -= 1;
        }


        return arr; // 임시
    }
    public static void main(String[] args) {

    }
}
