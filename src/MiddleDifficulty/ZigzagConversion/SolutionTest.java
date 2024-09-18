package MiddleDifficulty.ZigzagConversion;

import java.util.*;
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        System.out.println(solution.convert(s, n));
    }
}
