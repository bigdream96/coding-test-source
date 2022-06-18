package com.codingtest.source.programmers.p42885;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int result = 0;
        int left = 0;
        int right = people.length - 1;

        Arrays.sort(people);

        while (right >= left) {
            if (people[right--] + people[left] <= limit)
                left++;

            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println(result);
    }
}