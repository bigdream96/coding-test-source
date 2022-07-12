package com.codingtest.source.programmers.p12933;

import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr);

        long result = 0L;
        int digit = 1;
        for(char v : arr) {
            result += (v - 48L) * digit;
            digit *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(118372);
        System.out.println(result);
    }
}