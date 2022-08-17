package com.codingtest.source.programmers.p76502;

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        LinkedList<Character> brackets = new LinkedList<>();
        Map<Character, Character> base = Map.of('[', ']', '{', '}', '(', ')');

        for (char ch : s.toCharArray()) {
            brackets.add(ch);
        }

        for (int i = 0; i < brackets.size(); i++) {
            if (isProperBracket(brackets, base)) {
                answer++;
            }
            brackets.addLast(brackets.removeFirst());
        }

        return answer;
    }

    private boolean isProperBracket(LinkedList<Character> list, Map<Character, Character> base) {
        Stack<Character> stack = new Stack<>();

        for (char ch : list) {
            if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                if (base.get(stack.peek()) == ch) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}