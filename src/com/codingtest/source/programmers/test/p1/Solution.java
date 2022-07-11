package com.codingtest.source.programmers.test.p1;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(3, 5);
        System.out.println("result = " + Arrays.toString(result));
    }

    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        long fn = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            fn *= i;
        }

        k--;
        int idx = 0;
        while (idx < answer.length) {
            fn /= n--;
            int i = (int)(k / fn);
            answer[idx++] = list.get(i);
            list.remove(i);
            k %= fn;
        }

        return answer;
    }
}