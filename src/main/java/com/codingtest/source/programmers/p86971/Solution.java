package com.codingtest.source.programmers.p86971;

import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        int[][] graph = new int[n + 1][n + 1];

        for (int[] ints : wires) {
            graph[ints[0]][ints[1]] = 1;
            graph[ints[1]][ints[0]] = 1;
        }

        int a, b;
        for (int[] wire : wires) {
            a = wire[0];
            b = wire[1];

            graph[a][b] = 0;
            graph[b][a] = 0;

            answer = Math.min(answer, bfs(graph, n, a));

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        return answer;
    }

    public int bfs(int[][] graph, int n, int start) {
        Queue<Integer> queue = new LinkedList<>();
        int[] visit = new int[n + 1];
        int cnt = 1;

        queue.offer(start);
        while (!queue.isEmpty()) {
            int point = queue.poll();
            visit[point] = 1;

            for (int i = 1; i <= n; i++) {
                if (visit[i] == 1)
                    continue;
                if (graph[point][i] == 1) {
                    queue.offer(i);
                    cnt++;
                }
            }
        }

        return Math.abs(n - 2 * cnt);
    }
}