package com.codingtest.source.programmers.p42883;

import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        StringBuilder result = new StringBuilder(number.length());
        Stack<Integer> stack = new Stack<>();

        int cnt = 0;
        for (char c : number.toCharArray()) {
            int v = c - 48;
            while (stack.size() > 0 && v > stack.peek() & cnt < k) {
                stack.pop();
                cnt++;
            }
            stack.push(v);
        }

        while (cnt++ < k)
            stack.pop();

        while (!stack.empty())
            result.insert(0, stack.pop());

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("4177252841", 4);
        System.out.println(result);
    }
}