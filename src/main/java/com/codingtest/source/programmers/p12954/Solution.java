package com.codingtest.source.programmers.p12954;

import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        int i = 0;
        long v = 0;
        while(i < n) {
            v += x;
            answer[i++] = v;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] result = solution.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}