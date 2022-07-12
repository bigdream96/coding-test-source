package com.codingtest.source.programmers.sk.q1;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] p) {
        int[] answer = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            int v1 = p[i];
            int tmp = v1;
            int tmpIdx = 0;
            for (int j = i + 1; j < p.length; j++) {
                int v2 = p[j];
                if (v2 < tmp) {
                    tmp = v2;
                    tmpIdx = j;
                }
            }

            if (v1 != tmp) {
                p[i] = tmp;
                p[tmpIdx] = v1;
                answer[i]++;
                answer[tmpIdx]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 5, 3, 1, 4});
        System.out.println(Arrays.toString(result));
    }
}