package com.codingtest.source.programmers.p42584;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < prices.length; i++) {
            if(stack.size() > 0) {
                if(prices[i] > prices[stack.peek()]) {
                    stack.push(i);
                } else {
                    while(stack.size() > 0 && prices[i] < prices[stack.peek()]) {
                        int v = stack.pop();
                        result[v] = i - v;
                    }
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }

        int sec = 0;
        while(!stack.empty()) {
            int i = stack.pop();
            result[i] = sec;

            if(stack.size() > 0) {
                sec += (i - stack.peek());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 2, 3, 2, 3, 1});
        System.out.println(Arrays.toString(result));
    }
}