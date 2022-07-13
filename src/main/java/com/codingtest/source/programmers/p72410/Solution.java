package com.codingtest.source.programmers.p72410;

class Solution {
    public String solution(String newId) {
        StringBuilder sb = new StringBuilder(newId.toLowerCase()
                .replaceAll("[^a-z0-9\\_\\.\\-]", "")
                .replaceAll("[\\.]{2,}", "\\.")
                .replaceAll("^(\\.)|(\\.)$", ""));

        if (sb.length() == 0)
            sb.append("a");

        if (sb.length() >= 16) {
            sb.delete(15, sb.length());
            if (sb.charAt(sb.length() - 1) == '.')
                sb.deleteCharAt(sb.length() - 1);
        }

        while (sb.length() <= 2)
            sb.append(sb.charAt(sb.length() - 1));

        return sb.toString();
    }
}