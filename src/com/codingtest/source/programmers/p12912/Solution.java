package com.codingtest.source.programmers.p12912;

class Solution {
    public long solution(int a, int b) {
        return (long)(Math.abs(a - b) + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(7, 3);
        System.out.println(result);
    }
}