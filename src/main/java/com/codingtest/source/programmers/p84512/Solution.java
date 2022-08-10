package com.codingtest.source.programmers.p84512;

/* 순서 = 문자 개수 + 각 자리 수가 변하기 위한 숫자 * A와 실제 문자와의 거리 */

import java.util.Map;

class Solution {
    public int solution(String word) {
        int answer = 0;
        Map<String, Integer> map = Map.of("A", 0, "E", 1, "I", 2, "O", 3, "U", 4);
        int[] base = {781, 156, 31, 6, 1};

        int i = 0;
        for (String s : word.split(""))
            answer += base[i++] * map.get(s);

        return word.length() + answer;
    }
}