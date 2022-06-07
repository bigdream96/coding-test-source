package com.codingtest.source.programmers.p42578;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;

        for(String[] clothe : clothes)
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);

        for(String key : map.keySet())
            answer *= map.get(key) + 1;

        return answer - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println(result);
    }
}