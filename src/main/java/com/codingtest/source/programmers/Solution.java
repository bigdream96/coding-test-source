package com.codingtest.source.programmers;

import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cacheHit = 1;
        int cacheMiss = 5;
        LinkedList<String> list = new LinkedList<>();

        if (cacheSize == 0)
            return cities.length * cacheMiss;

        for (String city : cities) {
            city = city.toLowerCase();

            if (list.size() < cacheSize) {
                if (list.contains(city)) {
                    list.remove(city);
                    answer += cacheHit;
                } else {
                    answer += cacheMiss;
                }
            } else {
                if (list.contains(city)) {
                    list.remove(city);
                    answer += cacheHit;
                } else {
                    list.removeFirst();
                    answer += cacheMiss;
                }
            }

            list.addLast(city);
        }

        return answer;
    }
}