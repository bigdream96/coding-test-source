package com.codingtest.source.programmers.p12902;

class Solution {
    private static final int MOD = 1000000007;

    public int solution(int n) {
        int[] cache = new int[n + 1];

        cache[1] = 2;
        cache[2] = 3;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                cache[i] = cache[i - 1] % MOD + cache[i - 2] % MOD;
            } else {
                cache[i] = cache[i - 1] * 2 % MOD + cache[i - 2] % MOD;
            }
            cache[i] %= MOD;
        }

        return cache[n];
    }
}