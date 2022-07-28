package com.codingtest.source.programmers.p12924;

class Solution {
    public int solution(int n) {
        return recursive(1, n, (n / 2) + 1);
    }

    public int recursive(int start, int n, int mid) {
        if (start == mid)
            return 1;

        int sum = 0;
        for (int i = start; i <= mid; i++) {
            sum += i;
            if (sum == n) {
                return 1 + recursive(start + 1, n, mid);
            } else if (sum > n) {
                return recursive(start + 1, n, mid);
            }
        }

        return recursive(start + 1, n, mid);
    }
}