package com.codingtest.source.programmers.p12899;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while(n > 0) {
            if(n % 3 == 0) {
                answer.insert(0, 4);
                n = (n / 3) - 1;
            } else {
                answer.insert(0, n % 3);
                n /= 3;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(30);
        System.out.println(result);
    }
}