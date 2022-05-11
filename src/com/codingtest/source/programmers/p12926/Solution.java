package com.codingtest.source.programmers.p12926;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s.length());

        for(char c : s.toCharArray()) {
            if(c == ' ') {
               sb.append(' ');
               continue;
            }

            int v = c + n;
            boolean isUpper = 65 <= c && c <= 90;
            sb.append(isUpper ? (char)(v > 90 ? 65 + (v - 90) - 1 : v) : (char)(v > 122 ? 97 + (v - 122) - 1 : v));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("a B z", 4);
        System.out.println(result);
    }
}