package MiddleDifficulty.PermutationsII;

import java.util.*;

class Solution {
    private final List<List<Integer>> permutations = new ArrayList<>();
    private boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(0, nums, new ArrayList<>());
        return permutations;
    }
    private void dfs(int k, int[] nums, List<Integer> res) {
        if (k == nums.length) {
            permutations.add(new ArrayList<>(res));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) continue;
            visited[i] = true;
            res.add(nums[i]);
            dfs(k + 1, nums, res);
            res.removeLast();
            visited[i] = false;
        }
    }
}
