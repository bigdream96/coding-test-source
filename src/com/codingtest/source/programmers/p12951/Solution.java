package com.codingtest.source.programmers.p12951;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution("for the last week");
        System.out.println("answer = " + answer);
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                if ((sb.length() == 0 || sb.charAt(sb.length() - 1) == ' ') && isLowercase(ch)) {
                    sb.append(lowerToUpper(ch));
                } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ' && isUppercase(ch)) {
                    sb.append(upperToLower(ch));
                } else {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    boolean isLowercase(char ch) {
        return 'a' <= ch && ch <= 'z';
    }

    boolean isUppercase(char ch) {
        return 'A' <= ch && ch <= 'Z';
    }

    char lowerToUpper(char ch) {
        return (char)(ch - 32);
    }

    char upperToLower(char ch) {
        return (char)(ch + 32);
    }
}