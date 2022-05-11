package com.codingtest.source.programmers.p87389;

class Solution {
    public int solution(int n) {
        for(int i = 2; i <= n; i++)
            if(n % i == 1)
                return i;

        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(1000000);
        System.out.println(result);
    }
}