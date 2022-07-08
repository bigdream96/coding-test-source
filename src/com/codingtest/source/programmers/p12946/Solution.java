package com.codingtest.source.programmers.p12946;

import java.util.Arrays;

class Solution {
    static int i = 0;

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] answer = solution.solution(2);
        System.out.println(Arrays.deepToString(answer));
    }

    public int[][] solution(int n) {
        int[][] answer = new int[(int)(Math.pow(2, n) - 1)][2];
        hanoi(1, 2, 3, n, answer);
        return answer;
    }

    void hanoi(int from, int m, int to, int n, int[][] arr) {
        if (n == 0)
            return;

        hanoi(from, to, m, n - 1, arr);
        arr[i][0] = from;
        arr[i++][1] = to;
        hanoi(m, from, to, n - 1, arr);
    }
}