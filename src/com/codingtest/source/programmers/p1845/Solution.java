package com.codingtest.source.programmers.p1845;

import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int goal = nums.length / 2;
        HashSet<Integer> types = new HashSet<>();

        for(int num : nums)
            types.add(num);

        return Math.min(types.size(), goal);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3,1,2,3});
        System.out.println(result);
    }
}
