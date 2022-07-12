/**
 * question source: https://programmers.co.kr/learn/courses/30/lessons/81301
 */

package com.codingtest.source.programmers.p81301;

import java.util.Map;

class Solution {
    private final Map<String, String> wordForNumStr = Map.of("zero","0","one","1","two","2","three","3","four","4","five","5","six","6","seven","7","eight","8","nine","9");

    public int solution(String s) {
        for(String word : wordForNumStr.keySet())
            s = s.replace(word, wordForNumStr.get(word));

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("one4seveneight");
        System.out.println(result);
    }
}
