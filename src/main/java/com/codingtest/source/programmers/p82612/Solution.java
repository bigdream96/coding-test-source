package com.codingtest.source.programmers.p82612;

import static java.lang.Math.*;

class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(int i = 0, n = price; i++ < count; n += price)
            total += n;

        return max(total, money) - min(total, money);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(2500, 2500, 2500);
        System.out.println(result);
    }
}