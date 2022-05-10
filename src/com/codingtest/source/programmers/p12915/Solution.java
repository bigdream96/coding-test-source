package com.codingtest.source.programmers.p12915;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> s1.charAt(n) == s2.charAt(n) ? s1.compareTo(s2) : s1.charAt(n) - s2.charAt(n));
        return strings;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"zbcde", "ybcdf", "xbcdg"}, 1);
        System.out.println(Arrays.toString(result));
    }
}