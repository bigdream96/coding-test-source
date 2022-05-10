package com.codingtest.source.programmers.p12919;

class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder("김서방은 ");
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                sb.append(i);
                break;
            }
        }
        sb.append("에 있다");

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"Jane", "Kim"});
        System.out.println(result);
    }
}