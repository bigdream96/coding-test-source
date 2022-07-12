package com.codingtest.source.programmers.p62048;

class Solution {
    public long solution(int w, int h) {
        long total = (long)w * (long)h;
        long n = getGreComFac(w, h);
        long used = w + h - n;
        return total - used;
    }

    long getGreComFac(long n, long m) {
        long r1 = n;
        long r2 = m;
        while(r1 % r2 != 0) {
            long tmp = r1 % r2;
            r1 = r2;
            r2 = tmp;
        }
        return r2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(8,12);
        System.out.println("RESULT : " + result);
    }
}