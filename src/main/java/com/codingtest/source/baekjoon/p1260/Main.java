package com.codingtest.source.baekjoon.p1260;

import java.util.*;

public class Main {
    private static ArrayList<TreeSet<Integer>> list;
    private static Queue<Integer> queue;
    private static boolean[] visited;
    private static int start;

    public static void main(String[] args) {
        init();
        dfs(start);
        reset();
        bfs(start);
    }

    static void init() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        start = scanner.nextInt();
        visited = new boolean[n + 1];
        list = new ArrayList<>(m);
        queue = new LinkedList<>();

        for (int i = 0; i <= n; i++)
            list.add(new TreeSet<>());

        int cnt = 0;
        while (scanner.hasNextLine()) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            list.get(n1).add(n2);
            list.get(n2).add(n1);
            scanner.nextLine();
            if (++cnt == m) break;
        }

        scanner.close();
    }

    static void reset() {
        Arrays.fill(visited, false);
        System.out.println();
    }

    static void dfs(int v) {
        System.out.print(v + " ");

        visited[v] = true;

        for (int next : list.get(v))
            if (!visited[next])
                dfs(next);
    }

    static void bfs(int v) {
        queue.offer(v);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            visited[node] = true;

            System.out.print(node + " ");

            for (int next : list.get(node)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}