package com.codingtest.source.programmers.p12973;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution("baabaa");
        System.out.println(answer);
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray())
            if (stack.isEmpty() || ch != stack.peek())
                stack.push(ch);
            else
                stack.pop();

        return stack.size() == 0 ? 1 : 0;
    }
}