package com.codingtest.source.programmers.p42840;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int[][] base = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int a = 0, b = 0, c = 0;
        for(int answer : answers) {
            if(a == base[0].length) a = 0;
            if(b == base[1].length) b = 0;
            if(c == base[2].length) c = 0;
            if(answer == base[0][a++]) scores[0]++;
            if(answer == base[1][b++]) scores[1]++;
            if(answer == base[2][c++]) scores[2]++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        if(scores[0] == max) list.add(1);
        if(scores[1] == max) list.add(2);
        if(scores[2] == max) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(result));
    }
}