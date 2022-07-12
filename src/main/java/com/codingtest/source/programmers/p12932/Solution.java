package com.codingtest.source.programmers.p12932;

import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int[] result = new int[String.valueOf(n).length()];

        int i = 0;
        while(n > 0) {
            result[i++] = (int)(n % 10);
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(12345);
        System.out.println(Arrays.toString(result));
    }
}