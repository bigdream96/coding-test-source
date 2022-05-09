package com.codingtest.source.programmers.p12940;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int r1 = n;
        int r2 = m;
        while(r1 % r2 != 0) {
            int tmp = r1 % r2;
            r1 = r2;
            r2 = tmp;
        }
        answer[0] = r2;
        answer[1] = (n*m) / r2;

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}