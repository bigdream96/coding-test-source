package com.codingtest.source.programmers.p12948;

class Solution {
    public String solution(String phoneNumber) {
        return "*".repeat(phoneNumber.length()-4) + phoneNumber.substring(phoneNumber.length()-4);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("01033334444");
        System.out.println(result);
    }
}
