package com.codingtest.source.programmers.p86491;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for(int[] size : sizes) {
            if(size[0] > size[1]) {
                int tmp = size[1];
                size[1] = size[0];
                size[0] = tmp;
            }
            if(size[0] > maxWidth) {
                maxWidth = size[0];
            }
            if(size[1] > maxHeight) {
                maxHeight = size[1];
            }
        }

        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});
        System.out.println(result);
    }
}