package com.codingtest.source.programmers.p42748;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int idx = 0;
        for(int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] newArray = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(newArray);
            answer[idx++] = newArray[k-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},{4, 4, 1},{1, 7, 3}});
        System.out.println(Arrays.toString(result));
    }
}