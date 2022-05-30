package com.codingtest.source.programmers.p42626;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int answer = 0;

        for(int n : scoville)
            q.add(n);

        while(q.peek() < k && q.size() >= 2) {
            int n = q.poll() + (q.poll() * 2);
            q.add(n);
            answer++;
        }

        return q.peek() > k ? answer : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println(result);
    }
}