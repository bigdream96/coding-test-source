package com.codingtest.source.programmers.p12934;

class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n);
        return n == sqrt * sqrt ? (sqrt + 1) * (sqrt + 1) : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(121);
        System.out.println(result);
    }
}