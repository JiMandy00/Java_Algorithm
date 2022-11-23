// 22 11 22
// Array에 있는 값 모두 더하기

package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion02 {
    public static int listSumAll(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        }

        return nums.remove(nums.size() -1) + listSumAll(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        Recursion02 recursion02 = new Recursion02();
        recursion02.listSumAll(nums);
    }
}
