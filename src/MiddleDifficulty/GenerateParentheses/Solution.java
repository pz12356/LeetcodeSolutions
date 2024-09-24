package MiddleDifficulty.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> list = new ArrayList<>();
    StringBuilder str = new StringBuilder();
    int stackLength = 0;
    int length = 0;
    public List<String> generateParenthesis(int n) {
        this.length = n * 2;
        dfs(0);
        return list;
    }
    private void dfs(int n) {
        if (n > this.length) {
            return;
        }
        if (n == this.length && stackLength == 0) {
            list.add(str.toString());
            return;
        }
        stackLength++;
        str.append('(');
        dfs(n + 1);
        str.deleteCharAt(str.length() - 1);
        stackLength--;
        if (stackLength > 0) {
            stackLength--;
            str.append(')');
            dfs(n + 1);
            str.deleteCharAt(str.length() - 1);
            stackLength++;
        }
    }
}