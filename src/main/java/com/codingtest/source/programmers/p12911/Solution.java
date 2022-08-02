package com.codingtest.source.programmers.p12911;

class Solution {
    public int solution(int n) {
        int original = count(n);

        while (count(++n) != original);

        return n;
    }

    int count(int n) {
        int result = 0;

        for (char ch : Integer.toBinaryString(n).toCharArray())
            if (ch == '1')
                result++;

        return result;
    }
}