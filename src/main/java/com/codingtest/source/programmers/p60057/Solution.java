package com.codingtest.source.programmers.p60057;

import java.util.LinkedList;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length(); i++) {
            StringBuilder result = new StringBuilder(s.length());
            LinkedList<String> items = new LinkedList<>();

            int idx = 0;
            while (idx < s.length()) {
                items.add(s.substring(idx, Math.min(idx + i, s.length())));
                idx += i;
            }

            String curItem = items.removeFirst();
            int count = 1;
            for (String item : items) {
                if (item.equals(curItem)) {
                    count++;
                } else {
                    result.append(count > 1 ? count : "").append(curItem);
                    curItem = item;
                    count = 1;
                }
            }

            result.append(count > 1 ? count : "").append(curItem);
            answer = Math.min(result.length(), answer);
        }

        return answer;
    }
}