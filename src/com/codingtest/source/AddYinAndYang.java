package com.codingtest.source;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 */

public class AddYinAndYang {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for(int i=0; i<absolutes.length; i++)
                answer += signs[i] ? absolutes[i] : -absolutes[i];

            return answer;
        }
    }

    public static void main(String[] args) {
        AddYinAndYang addYinAndYang = new AddYinAndYang();
        AddYinAndYang.Solution solution = addYinAndYang.new Solution();
        System.out.println(solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));
    }
}
