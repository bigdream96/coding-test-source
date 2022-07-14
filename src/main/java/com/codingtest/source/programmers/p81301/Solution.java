package com.codingtest.source.programmers.p81301;

import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, String> wordForNumber = Map.of("zero", "0", "one", "1", "two", "2", "three", "3", "four", "4", "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9");

        for (String word : wordForNumber.keySet())
            s = s.replace(word, wordForNumber.get(word));

        return Integer.parseInt(s);
    }
}