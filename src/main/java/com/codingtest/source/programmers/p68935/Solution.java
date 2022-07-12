package com.codingtest.source.programmers.p68935;

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        LinkedList<Integer> list = new LinkedList<>();

        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        int digits = 1;
        for (int v : list)
            answer += v * (int)Math.pow(3, list.size() - digits++);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(45);
        System.out.println(result);
    }
}