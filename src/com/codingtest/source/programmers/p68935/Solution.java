package com.codingtest.source.programmers.p68935;

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>(17);
        while(n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        int v = 1;
        for(int i = 0; i < list.size(); i++)
            answer += list.get(i) * (int)Math.pow(3, list.size() - v++);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(45);
        System.out.println(result);
    }
}
