package com.codingtest.source.programmers.p12939;

import static java.lang.Integer.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution("-1 -2 -3 -4");
        System.out.println(answer);
    }

    public String solution(String s) {
        int min = MAX_VALUE;
        int max = MIN_VALUE;

        for (String v : s.split(" ")) {
            int num = parseInt(v);
            min = min(min, num);
            max = max(max, num);
        }

        return min + " " + max;
    }
}