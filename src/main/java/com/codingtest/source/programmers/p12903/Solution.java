package com.codingtest.source.programmers.p12903;

class Solution {
    public String solution(String s) {
        boolean isEven = s.length() % 2 == 0;
        int start = s.length() / 2 - (isEven ? 1 : 0);
        int end = isEven ? start + 2 : start + 1;
        return s.substring(start, end);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("we");
        System.out.println(result);
    }
}