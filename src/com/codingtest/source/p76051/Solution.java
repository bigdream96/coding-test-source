package com.codingtest.source.p76051;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 */

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++)
            answer += signs[i] ? absolutes[i] : -absolutes[i];

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));
    }
}
