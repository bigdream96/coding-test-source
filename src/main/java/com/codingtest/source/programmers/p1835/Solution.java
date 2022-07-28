package com.codingtest.source.programmers.p1835;

class Solution {
    public int solution(int n, String[] data) {
        int result = 0;
        String base = "ACFJMNRT";

        int[] factorials = new int[base.length() + 1];
        factorials[0] = 1;
        for (int i = 1; i <= base.length(); i++)
            factorials[i] = factorials[i - 1] * i;

        for (int i = 0; i < factorials[base.length()]; i++) {
            StringBuilder permutation = new StringBuilder();
            String tmp = base;
            int posCode = i;
            for (int pos = base.length(); pos > 0; pos--) {
                int selected = posCode / factorials[pos - 1];
                permutation.append(tmp.charAt(selected));
                posCode = posCode % factorials[pos - 1];
                tmp = tmp.substring(0, selected) + tmp.substring(selected + 1);
            }
            if (checkCondition(data, permutation.toString()))
                result++;
        }

        return result;
    }

    public boolean checkCondition(String[] conditions, String text) {
        for (String condition : conditions) {
            int interval = Math.abs(text.indexOf(condition.charAt(0)) - text.indexOf(condition.charAt(2))) - 1;
            char operator = condition.charAt(3);
            int n = condition.charAt(4) - 48;

            if ('>' == operator && interval <= n) {
                return false;
            } else if ('<' == operator && interval >= n) {
                return false;
            } else if ('=' == operator && interval != n) {
                return false;
            }
        }

        return true;
    }
}