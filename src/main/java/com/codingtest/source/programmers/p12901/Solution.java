package com.codingtest.source.programmers.p12901;

import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(5, 24);
        System.out.println(result);
    }
}