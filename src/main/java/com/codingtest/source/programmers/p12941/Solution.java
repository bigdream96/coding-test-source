package com.codingtest.source.programmers.p12941;

import java.util.Arrays;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++)
            answer += a[i] * b[a.length - i - 1];

        return answer;
    }
}