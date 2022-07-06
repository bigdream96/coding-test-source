package com.codingtest.source.programmers.p12985;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(8,4,5);
        System.out.println(answer);
    }

    public int solution(int n, int a, int b) {
        int answer = 1;

        while (Math.abs(a - b) > 1 || ((Math.min(a, b) - 1) % 2 > 0 && Math.abs(a - b) == 1)) {
            a = (int)Math.ceil((double)a / 2);
            b = (int)Math.ceil((double)b / 2);
            answer++;
        }

        return answer;
    }
}