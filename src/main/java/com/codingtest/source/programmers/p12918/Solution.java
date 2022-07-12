package com.codingtest.source.programmers.p12918;

class Solution {
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("^[0-9]*$");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution("1234");
        System.out.println(result);
    }
}