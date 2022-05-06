package com.codingtest.source.programmers.p12944;

class Solution {
    public double solution(int[] arr) {
        double sum = 0.0d;

        for (int v : arr)
            sum += v;

        return sum / arr.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        double result = solution.solution(new int[]{1,2,3,4});
        System.out.println(result);
    }
}