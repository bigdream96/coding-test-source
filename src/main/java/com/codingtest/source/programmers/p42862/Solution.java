package com.codingtest.source.programmers.p42862;

import java.util.HashMap;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = n;

        for(int i=1; i<=n; i++)
            map.put(i, 1);
        for(int item : reserve)
            map.put(item, map.get(item)+1);
        for(int item : lost)
            map.put(item, map.get(item)-1);

        for(int i=1; i<=n; i++) {
            if(map.get(i) == 0) {
                if(map.getOrDefault(i-1, -1) == 2) {
                    map.put(i-1, 1);
                    map.put(i, 1);
                } else if(map.getOrDefault(i+1, -1) == 2) {
                    map.put(i+1, 1);
                    map.put(i, 1);
                } else {
                    result--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(5, new int[]{1, 2}, new int[]{2, 3, 5});
        System.out.println(result);
    }
}
