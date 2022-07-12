package com.codingtest.source.programmers.p12916;

class Solution {
    boolean solution(String s) {
        return s.replaceAll("[^pP]", "").length() == s.replaceAll("[^yY]", "").length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution("pPoooyY");
        System.out.println(result);
    }
}