package com.codingtest.source.programmers.p12921;

class Solution {
    public int solution(int n) {
        boolean[] arr = new boolean[n + 1];

        for(int i = 2; i <= n; i++) {
            if(arr[i])
                continue;
            for(int j = 2 * i; j <= n; j += i)
                arr[j] = true;
        }

        int count = 0;
        for(int i = 2; i <= n; i++)
            if(!arr[i])
                count++;

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(1000);
        System.out.println(result);
    }
}