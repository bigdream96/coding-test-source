package com.codingtest.source.programmers.p42889;

import java.util.TreeSet;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    class Stage implements Comparable<Stage> {
        int id;
        float failRate;

        public Stage(int id, Float failRate) {
            this.id = id;
            this.failRate = failRate;
        }

        @Override
        public int compareTo(Stage s) {
            int compare = Float.compare(this.failRate, s.failRate);
            return compare == 0 ? Integer.compare(this.id, s.id) : compare * -1;
        }
    }

    public int[] solution(int n, int[] plays) {
        int[] result = new int[n];
        HashMap<Integer, Integer> userToFailCnt = new HashMap<>();
        TreeSet<Stage> stages = new TreeSet<>();

        for(int play : plays)
            userToFailCnt.put(play, userToFailCnt.getOrDefault(play, 0) + 1);

        int total = plays.length;
        for(int i=1; i<=n; i++) {
            int failCnt = userToFailCnt.getOrDefault(i, 0);
            float failRate = userToFailCnt.containsKey(i) ? (float)failCnt / (float)total : 0.0f;
            total -= failCnt;
            stages.add(new Stage(i, failRate));
        }

        int i=0;
        for(Stage stage : stages)
            result[i++] = stage.id;

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        System.out.println(Arrays.toString(result));
    }
}