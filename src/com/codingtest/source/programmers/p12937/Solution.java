package com.codingtest.source.programmers.p12937;

class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(3);
        System.out.println(result);
    }
}