package com.codingtest.source.programmers.p60057;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for(int i = 1; i <= s.length(); i++) {
            StringBuilder result = new StringBuilder(s.length());
            String[] items = s.split("(?<=\\G[a-z]{" + i + "})");
            String curText = items[0];
            int count = 1;
            for(int j = 1; j < items.length; j++) {
                if(items[j].equals(curText)) {
                    count++;
                } else {
                    result.append(count > 1 ? count : "").append(curText);
                    curText = items[j];
                    count = 1;
                }
            }
            result.append(count > 1 ? count : "").append(curText);
            answer = Math.min(result.length(), answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("xababcdcdababcdcd");
        System.out.println(result);
    }
}