package com.codingtest.source.programmers.p43163;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println(result);
    }

    public int solution(String begin, String target, String[] words) {
        int answer = dfs(begin, target, words, new boolean[words.length], 1, words.length);
        return answer == words.length ? 0 : answer;
    }

    private int dfs(String begin, String target, String[] words, boolean[] visited, int cnt, int answer) {
        if (begin.equals(target))
            return cnt - 1;

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isOneDiffChar(begin, words[i])) {
                visited[i] = true;
                answer = Math.min(answer, dfs(words[i], target, words, visited, cnt + 1, answer));
                visited[i] = false;
            }
        }

        return answer;
    }

    private boolean isOneDiffChar(String a, String b) {
        int diffCnt = 0;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                diffCnt++;

        return diffCnt == 1;
    }
}