package MiddleDifficulty.GenerateParentheses;

import java.util.Scanner;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        System.out.println(solution.generateParenthesis(n).toString());
    }
}
