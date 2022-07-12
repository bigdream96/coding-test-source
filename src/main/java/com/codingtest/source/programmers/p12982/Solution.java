package com.codingtest.source.programmers.p12982;

import java.util.TreeMap;

class Solution {
    public int solution(int[] amounts, int budget) {
        TreeMap<Integer, Integer> amountToCnt = new TreeMap<>();

        for(int amount : amounts)
            amountToCnt.put(amount, amountToCnt.getOrDefault(amount, 0) + 1);

        int n = 0;
        for(int k : amountToCnt.keySet())
            for (int i = 0; i < amountToCnt.get(k); i++)
                if((budget -= k) >= 0)
                    n++;
                else
                    return n;

        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1,3,2,5,4}, 9);
        System.out.println(result);
    }
}