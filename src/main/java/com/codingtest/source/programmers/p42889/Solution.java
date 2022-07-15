package com.codingtest.source.programmers.p42889;

import java.util.*;

class Solution {
    public int[] solution(int n, int[] plays) {
        int[] result = new int[n];
        int total = plays.length;
        Map<Integer, Integer> cntByUser = new HashMap<>();
        Set<Stage> stages = new TreeSet<>();

        for (int play : plays)
            cntByUser.put(play, cntByUser.getOrDefault(play, 0) + 1);

        for (int i = 1; i <= n; i++) {
            int cnt = cntByUser.getOrDefault(i, 0);
            float rate = cntByUser.containsKey(i) ? (float)cnt / (float)total : 0.0f;
            total -= cnt;
            stages.add(Stage.of(i, rate));
        }

        int idx = 0;
        for (Stage stage : stages)
            result[idx++] = stage.id;

        return result;
    }
}

class Stage implements Comparable<Stage> {
    int id;
    float rate;

    public Stage(int id, float rate) {
        this.id = id;
        this.rate = rate;
    }

    @Override
    public int compareTo(Stage stage) {
        int n = Float.compare(this.rate, stage.rate);
        return n == 0 ? Integer.compare(this.id, stage.id) : n * -1;
    }

    public static Stage of(int id, float rage) {
        return new Stage(id, rage);
    }
}