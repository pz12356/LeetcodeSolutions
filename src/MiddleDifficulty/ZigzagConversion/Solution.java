package MiddleDifficulty.ZigzagConversion;

import java.util.*;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        Queue<Character>[] q = new Queue[numRows];
        for (int i = 0; i < numRows; i++) {
            q[i] =  new LinkedList<>();
        }
        StringBuilder res = new StringBuilder();
        final int mod = 2 * (numRows - 1);
        for (int i = 0; i < s.length(); i++) {
            if (i % mod < numRows) {
                q[i % mod].offer(s.charAt(i));
            } else {
                q[mod - i % mod].offer(s.charAt(i));
            }
        }
        for (int i = 0; i < numRows; i++) {
            while (!q[i].isEmpty()) {
                res.append(q[i].poll());
            }
        }
        return res.toString();
    }
};
