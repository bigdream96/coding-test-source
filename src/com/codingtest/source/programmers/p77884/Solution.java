package com.codingtest.source.programmers.p77884;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        if(left == 1 && right == 1)
            return 1;

        for(int i = left; i <= right; i++) {
            int cnt = i > 1 ? 2 : 1;
            int d = i % 2 == 0 ? 2 : 3;

            for(int j = d; j < i; j++)
                if(i % j == 0)
                    cnt++;

            answer += cnt % 2 == 0 ? i : i * -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(1, 2);
        System.out.println(result);
    }
}
