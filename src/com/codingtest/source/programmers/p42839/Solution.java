package com.codingtest.source.programmers.p42839;

import java.util.*;

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>(numbers.length());
        permutations(set, "", numbers);
        return set.size();
    }

    void permutations(HashSet<Integer> set, String candidate, String remaining) {
        if (!"".equals(candidate))
            addNumber(set, candidate);

        for (int i = 0; i < remaining.length(); i++) {
            String newCandidate = candidate + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permutations(set, newCandidate, newRemaining);
        }
    }

    void addNumber(HashSet<Integer> set, String s) {
        int n = Integer.parseInt(s);
        if (isPrimeNumber(n))
            set.add(n);
    }

    boolean isPrimeNumber(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("121");
        System.out.println(result);
    }
}