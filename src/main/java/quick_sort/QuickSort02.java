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
        int rightIdx = arr.length-1;
        int tmp = 0;

        System.out.println("pivot : " + pivot);

        while (arr[leftIdx] < pivot) {
            leftIdx += 1;
        }
        while (arr[rightIdx] > pivot) {
            rightIdx -= 1;
        }

        System.out.println("leftIdx : " + leftIdx);
        System.out.println("rightIdx : " + rightIdx);


        return arr; // 임시
    }
    public static void main(String[] args) {
        QuickSort02 qs = new QuickSort02();
        int[] arr =  {20, 60, 5, 19, 40, 50, 5, 45};
        qs.Sort(arr);
    }
}
