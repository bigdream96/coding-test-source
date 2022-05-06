package com.codingtest.source.programmers.p12930;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s.length());

        int n = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != ' ') {
                boolean isEven = n++ % 2 == 0;
                boolean isUpper = 65 <= c && c <= 90;
                c = isEven ? (isUpper ? c : (char)(c - 32)) :(!isUpper ? c : (char)(c + 32));
            } else {
                n = 0;
            }
            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("try hello world");
        System.out.println(result);
    }
}