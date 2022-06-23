package com.codingtest.source.programmers.p43162;

import java.util.*;

public class Solution {
    private static LinkedList<TreeSet<Integer>> networks;
    private static Queue<Integer> queue;
    private static boolean[] visited;
    private static int cnt = 0;

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        System.out.println(result);
    }

    public int solution(int n, int[][] computers) {
        init(n, computers);
        search(n);
        return cnt;
    }

    void init(int n, int[][] computers) {
        networks = new LinkedList<>();
        queue = new LinkedList<>();
        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            networks.add(new TreeSet<>());

        for (int i = 0; i < computers.length; i++)
            for (int j = 0; j < computers[0].length; j++)
                if (i != j && computers[i][j] == 1)
                    networks.get(i).add(j);
    }

    private void search(int n) {
        for (int i = 0; i < n; i++)
            if (!visited[i])
                bfs(i);
    }

    private void bfs(int i) {
        visited[i] = true;
        queue.offer(i);

        while (!queue.isEmpty()) {
            for (int item : networks.get(queue.poll())) {
                if (!visited[item]) {
                    queue.add(item);
                    visited[item] = true;
                }
            }
        }

        cnt++;
    }
}