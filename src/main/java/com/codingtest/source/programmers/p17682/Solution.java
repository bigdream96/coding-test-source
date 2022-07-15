package com.codingtest.source.programmers.p17682;

import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Character, Integer> bonusMap = Map.of('S', 1, 'D', 2, 'T', 3);
        Map<Character, Integer> optionMap = Map.of('*', 2, '#', -1);
        Matcher m1 = Pattern.compile("[0-9]0?").matcher(dartResult);
        Matcher m2 = Pattern.compile("[SDT][*#]*").matcher(dartResult);

        while (m1.find() && m2.find()) {
            int score = Integer.parseInt(m1.group());
            String item = m2.group();
            int bonus = bonusMap.get(item.charAt(0));
            int option = item.length() == 2 ? optionMap.get(item.charAt(1)) : 1;

            list.add((int)Math.pow(score, bonus));

            if (option > 0 && list.size() > 1) {
                int v = list.remove(list.size() - 2);
                list.add(list.size() - 1, v * option);
            }

            int v = list.remove(list.size() - 1);
            list.add(v * option);
        }

        for (int v : list)
            result += v;

        return result;
    }
}