package com.codingtest.source.programmers.p42746;

import java.util.LinkedList;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        LinkedList<String> list = new LinkedList<>();

        for (int number : numbers)
            list.add(String.valueOf(number));

        list.sort((s1, s2) -> Integer.compare(Integer.parseInt(s1 + s2), Integer.parseInt(s2 + s1)) * -1);

        for (String number : list)
            answer.append(number);

        if ("0".equals(answer.substring(0, 1)))
            return "0";

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{3, 30, 34, 5, 9});
        System.out.println(result);
    }
}