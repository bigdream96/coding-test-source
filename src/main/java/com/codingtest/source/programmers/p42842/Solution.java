package com.codingtest.source.programmers.p42842;

import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int hv = (brown + 4) / 2;
        double diff = Math.sqrt(hv * hv - 4 * (brown + yellow));
        return new int[]{(int)(hv + diff) / 2, (int)(hv - diff) / 2};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(10, 2);
        System.out.println(Arrays.toString(result));
    }
}