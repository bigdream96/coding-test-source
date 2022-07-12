package com.codingtest.source.programmers.p17681;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            String v = Integer.toBinaryString(arr1[i] | arr2[i]);
            v = v.length() != n ? "0".repeat(n - v.length()) + v : v;
            answer[i] = v.replace("0", " ").replace("1", "#");
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
        System.out.println(Arrays.toString(result));
    }
}
