package com.codingtest.source.programmers.p12914;

class Solution {
    public long solution(int n) {
        return func(n);
    }

    int func(int n) {
        int[] cache = new int[n + 1];

        cache[0] = 1;
        cache[1] = 1;
        for (int i = 2; i < cache.length; i++)
            cache[i] = (cache[i - 2] + cache[i - 1]) % 1234567;

        return cache[n];
    }
}