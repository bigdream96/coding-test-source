/**
 * question source: https://programmers.co.kr/learn/courses/30/lessons/86051
 */

package com.codingtest.source.programmers.p86051;

class Solution {
    public int solution(int[] numbers) {
        int result = 45;

        for(int number : numbers)
            result -= number;

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
