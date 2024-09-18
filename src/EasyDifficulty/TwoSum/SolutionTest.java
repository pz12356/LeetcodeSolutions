package EasyDifficulty.TwoSum;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
