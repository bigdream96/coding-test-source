package com.codingtest.source.programmers.p12900;

class Solution {
    public int solution(int n) {
        int[] cache = new int[n + 1];
        final int MOD = 1_000_000_007;

        cache[0] = 1;
        cache[1] = 1;
        for (int i = 2; i < cache.length; i++) {
            cache[i] = (cache[i - 1] % MOD) + (cache[i - 2] % MOD);
            cache[i] %= MOD;
        }

        return cache[cache.length - 1];
    }
}