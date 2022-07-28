package com.codingtest.source.programmers.p12953;

import static java.lang.Math.*;

class Solution {
    public int solution(int[] arr) {
        return nlcm(arr);
    }

    int nlcm(int[] num) {
        int answer = num[0];

        for (int i = 1; i < num.length; i++)
            answer = (num[i] * answer) / gcd(max(answer, num[i]), min(answer, num[i]));

        return answer;
    }

    int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}