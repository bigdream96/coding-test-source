package com.codingtest.source.programmers.p12917;

import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder(s.length());
        List<Integer> encodes = new ArrayList<>(s.length());

        for(int c : s.toCharArray())
            encodes.add(c);

        encodes.sort(Comparator.reverseOrder());

        for(int c : encodes)
            result.append((char)c);

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Zbcdefg");
        System.out.println(result);
    }
}