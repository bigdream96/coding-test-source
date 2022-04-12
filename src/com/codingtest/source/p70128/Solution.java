package com.codingtest.source.p70128;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++)
            answer += a[i]*b[i];

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
    }
}