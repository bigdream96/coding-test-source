package com.codingtest.source.programmers.p17681;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String v = Integer.toBinaryString(arr1[i] | arr2[i]);
            v = v.length() != n ? "0".repeat(n - v.length()) + v : v;
            answer[i] = v.replace("0", " ").replace("1", "#");
        }

        return answer;
    }
}