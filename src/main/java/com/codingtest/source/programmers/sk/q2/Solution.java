package com.codingtest.source.programmers.sk.q2;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = new int[2];
        int[] sumThis = new int[periods.length];
        int[] sumNext = new int[periods.length];

        for (int i = 0; i < periods.length; i++) {
            int[] payment = payments[i];
            for (int j = 0; j < payment.length; j++) {
                sumThis[i] += payment[j];
                if (j > 0) {
                    sumNext[i] += payment[j];
                }
            }
            sumNext[i] += estimates[i];

            boolean isThisVip = checkVip(periods[i], sumThis[i]);
            boolean isNextVip = checkVip(periods[i] + 1, sumNext[i]);
            if (!isThisVip && isNextVip) {
                answer[0]++;
            }
            if (isThisVip && !isNextVip) {
                answer[1]++;
            }
        }

        return answer;
    }

    boolean checkVip(int period, int payment) {
        if (period >= 60 && payment >= 600_000) {
            return true;
        } else {
            return period >= 24 && payment >= 900_000;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{20, 23, 24}, new int[][]{{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}, {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}, {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}}, new int[]{100000, 100000, 100000});
        System.out.println(Arrays.toString(result));
    }
}