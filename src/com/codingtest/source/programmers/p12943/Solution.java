package com.codingtest.source.programmers.p12943;

class Solution {
    public int solution(int num) {
        if(num == 1)
            return num;

        long v = num;
        for(int i=1; i<=500; i++) {
            v = (v % 2 == 0) ? (v / 2L) : ((v * 3L) + 1L);
            if(v == 1L)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(1);
        System.out.println(result);
    }
}