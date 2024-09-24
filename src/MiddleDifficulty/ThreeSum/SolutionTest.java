package MiddleDifficulty.ThreeSum;

import java.util.List;
import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        List<List<Integer>> res = solution.threeSum(arr);
        System.out.println(res.toString());
    }
}
