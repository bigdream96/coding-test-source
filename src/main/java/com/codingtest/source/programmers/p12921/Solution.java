package com.codingtest.source.programmers.p12921;

class Solution {
    public int solution(int n) {
        int result = 0;
        boolean[] arr = new boolean[n + 1];

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i])
                continue;
            for(int j = 2 * i; j <= n; j += i)
                arr[j] = true;
        }

        for(int i = 2; i <= n; i++)
            if(!arr[i])
                result++;

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(100);
        System.out.println(result);
    }
}