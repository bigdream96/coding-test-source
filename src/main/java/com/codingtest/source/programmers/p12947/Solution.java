package com.codingtest.source.programmers.p12947;

class Solution {
    public boolean solution(int x) {
        int v = 0;
        int tmp = x;
        while(tmp > 0) {
            v += tmp % 10;
            tmp /= 10;
        }

        return x % v == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(18);
        System.out.println(result);
    }
}