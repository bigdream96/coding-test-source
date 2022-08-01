package com.codingtest.source.programmers.p12913;

class Solution {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            int bef = i - 1;
            land[i][0] += max(land[bef][1], land[bef][2], land[bef][3]);
            land[i][1] += max(land[bef][0], land[bef][2], land[bef][3]);
            land[i][2] += max(land[bef][0], land[bef][1], land[bef][3]);
            land[i][3] += max(land[bef][0], land[bef][1], land[bef][2]);
        }

        return max(land[land.length - 1]);
    }

    int max(int[] arr) {
        int max = 0;

        for (int n : arr)
            max = Math.max(max, n);

        return max;
    }

    int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}