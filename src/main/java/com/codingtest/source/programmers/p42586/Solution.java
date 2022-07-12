package com.codingtest.source.programmers.p42586;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            int v = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            if(!q.isEmpty() && q.peek() < v) {
                list.add(q.size());
                q.clear();
            }
            q.offer(v);
        }
        list.add(q.size());

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println(Arrays.toString(result));
    }
}