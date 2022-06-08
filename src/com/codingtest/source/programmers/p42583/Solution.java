package com.codingtest.source.programmers.p42583;

import java.util.LinkedList;

class Solution {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        int answer = 0;
        LinkedList<Integer> prepare = new LinkedList<>();
        LinkedList<Integer> bridge = new LinkedList<>();

        for (int truckWeight : truckWeights)
            prepare.offer(truckWeight);

        for (int i = 0; i < bridgeLength; i++)
            bridge.offer(0);

        int curWeight = 0;
        int curLength = 0;
        while (!bridge.isEmpty()) {
            int v1 = bridge.poll();
            if (v1 > 0) {
                curWeight -= v1;
                curLength--;
            }

            if (!prepare.isEmpty() && curWeight + prepare.peek() <= weight && curLength < bridgeLength) {
                int v2 = prepare.poll();
                bridge.offer(v2);
                curWeight += v2;
                curLength++;
            } else {
                bridge.offer(0);
            }

            answer++;

            if (prepare.isEmpty() && curLength == 0 && curWeight == 0)
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        System.out.println(result);
    }
}