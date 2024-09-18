package MiddleDifficulty.Permutations;

import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> permutations = new ArrayList<>();
        dfs(0, nums, visited, new ArrayList<>(), permutations);
        return permutations;
    }
    private void dfs(int k, int[] nums, boolean[] visited, List<Integer> res, List<List<Integer>> permutations) {
        if (k == nums.length) {
            permutations.add(new ArrayList<>(res));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            res.add(nums[i]);
            dfs(k + 1, nums, visited, res, permutations);
            res.removeLast();
            visited[i] = false;
        }
    }
}
