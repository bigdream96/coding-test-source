package com.codingtest.source.programmers.p12923;

class Solution {
    public int[] solution(long begin, long end) {
        int b = (int)begin;
        int e = (int)end;
        int[] answer = new int[e - b + 1];

        for (int i = b; i <= e; i++)
            answer[i - b] = getBlockNumber(i);

        return answer;
    }

    int getBlockNumber(int n) {
        if (n == 1)
            return 0;

        for (int v = 2; v <= Math.sqrt(n); v++)
            if (n % v == 0 && (n / v) <= 10_000_000)
                return n / v;

        return 1;
    }
}