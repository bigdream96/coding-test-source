package com.codingtest.source.programmers.p42587;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;

        for(int i = 0; i < priorities.length; i++)
            q.offer(i);

        main : while(q.size() > 0) {
            int n = q.poll();

            for(int v : q) {
                if(priorities[v] > priorities[n]) {
                    q.offer(n);
                    continue main;
                }
            }
            cnt++;

            if(n == location)
                return cnt;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println(result);
    }
}