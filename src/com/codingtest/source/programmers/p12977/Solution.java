package com.codingtest.source.programmers.p12977;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 7, 6, 4});
        System.out.println(result);
    }

    public int solution(int[] nums) {
        int result = 0;
        int n = nums.length;
        int r = 3;
        int[] combination = new int[r];

        for(int i = 0; i < r; i++)
            combination[i] = i;

        while(combination[r - 1] < n) {
            if(isPrime(nums[combination[0]] + nums[combination[1]] + nums[combination[2]]))
                result++;

            int t = r - 1;
            while(t != 0 && combination[t] == n - r + t)
                t--;

            combination[t]++;
            for(int i = t + 1; i < r; i++)
                combination[i] = combination[i - 1] + 1;
        }

        return result;
    }

    boolean isPrime(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }
}