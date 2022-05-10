package com.codingtest.source.programmers.p12922;

class Solution {
    public String solution(int n) {
        return "수박".repeat(n / 2) + (n % 2 == 0 ? "" : "수");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(5);
        System.out.println(result);
    }
}