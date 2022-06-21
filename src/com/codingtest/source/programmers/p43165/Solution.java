package com.codingtest.source.programmers.p43165;

public class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer += dfs(numbers[0], 1, numbers, target);
        answer += dfs(-numbers[0], 1, numbers, target);

        return answer;
    }

    public int dfs(int v, int i, int[] numbers, int target) {
        int answer = 0;

        if (i >= numbers.length)
            if (target == v)
                return 1;
            else
                return 0;

        answer += dfs(v + numbers[i], i + 1, numbers, target);
        answer += dfs(v - numbers[i], i + 1, numbers, target);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(result);
    }
}